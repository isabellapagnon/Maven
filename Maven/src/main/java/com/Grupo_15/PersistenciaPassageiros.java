package com.Grupo_15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class PersistenciaPassageiros {

    private final static CSVFormat passageirosCsvFormat = CSVFormat.DEFAULT.withHeader("cpf", "nome", "formaPagamento",
            "nroCartao");

    private Path passageirosPath;

    public PersistenciaPassageiros(Path passageirosPath) {
        this.passageirosPath = passageirosPath;
    }

    public List<Passageiro> carregaPassageiros() throws IOException {
        List<Passageiro> passageiros = new ArrayList<Passageiro>();

        try (Reader reader = Files.newBufferedReader(passageirosPath);
                CSVParser csvParser = new CSVParser(reader, passageirosCsvFormat.withFirstRecordAsHeader());) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                Passageiro p = new Passageiro(csvRecord.get(0), csvRecord.get(1),
                        FormaPagamento.valueOf(csvRecord.get(2)), csvRecord.get(3));
                passageiros.add(p);
            }
        }

        return passageiros;
    }

    public boolean persistePassageiros(List<Passageiro> passageiros) throws IOException {

        try (BufferedWriter writer = Files.newBufferedWriter(passageirosPath);
                CSVPrinter csvPrinter = new CSVPrinter(writer, passageirosCsvFormat);) {
            for (Passageiro p : passageiros) {
                csvPrinter.printRecord(p.getCpf(), p.getNome(), p.getFormaPagamento(), p.getNroCartao());
            }
            csvPrinter.flush();
        }

        return true;
    }
}