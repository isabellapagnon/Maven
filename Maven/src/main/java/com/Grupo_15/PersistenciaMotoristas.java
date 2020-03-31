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

public class PersistenciaMotoristas {

    private final static CSVFormat motoristasCsvFormat = CSVFormat.DEFAULT.withHeader("cpf", "nome", "veiculo",
            "formaPagamento");

    private Path motoristasPath;
    private List<Veiculo> veiculos;

    public PersistenciaMotoristas(Path motoristasPath, List<Veiculo> veiculos) {
        this.motoristasPath = motoristasPath;
        this.veiculos = veiculos;
    }

    public List<Motorista> carregaMotoristas() throws IOException {
        List<Motorista> motoristas = new ArrayList<Motorista>();

        try (Reader reader = Files.newBufferedReader(motoristasPath);
                CSVParser csvParser = new CSVParser(reader, motoristasCsvFormat.withFirstRecordAsHeader());) {
            for (CSVRecord csvRecord : csvParser) {

                String placa = csvRecord.get(2);
                Veiculo match = null;
                for (Veiculo v : veiculos) {
                    if (v.getPlaca().equals(placa)) {
                        match = v;
                        break;
                    }
                }

                Motorista m = new Motorista(csvRecord.get(0), csvRecord.get(1), match,
                        FormaPagamento.valueOf(csvRecord.get(3)));

                motoristas.add(m);
            }
        }

        return motoristas;
    }

    public boolean persisteMotoristas(List<Motorista> motoristas) throws IOException {

        try (BufferedWriter writer = Files.newBufferedWriter(motoristasPath);
                CSVPrinter csvPrinter = new CSVPrinter(writer, motoristasCsvFormat);) {
            for (Motorista m : motoristas) {
                String placa = null;
                Veiculo v = m.getVeiculo();
                if (v != null) {
                    placa = v.getPlaca();
                }
                csvPrinter.printRecord(m.getCpf(), m.getNome(), placa, m.getFormaPagamento());
            }
            csvPrinter.flush();
        }

        return true;
    }
}