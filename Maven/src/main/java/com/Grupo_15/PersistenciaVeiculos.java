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

public class PersistenciaVeiculos {

    private final static CSVFormat veiculosCsvFormat = CSVFormat.DEFAULT.withHeader("placa", "marca", "cor",
            "categoria");

    private Path veiculosPath;

    public PersistenciaVeiculos(Path veiculosPath) {
        this.veiculosPath = veiculosPath;
    }

    public List<Veiculo> carregaVeiculos() throws IOException {
        List<Veiculo> veiculos = new ArrayList<Veiculo>();

        try (Reader reader = Files.newBufferedReader(veiculosPath);
                CSVParser csvParser = new CSVParser(reader, veiculosCsvFormat.withFirstRecordAsHeader());) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                Veiculo v = new Veiculo(csvRecord.get(0), csvRecord.get(1), csvRecord.get(2),
                        CategoriaVeiculo.valueOf(csvRecord.get(3)));
                veiculos.add(v);
            }
        }

        return veiculos;
    }

    public boolean persisteVeiculos(List<Veiculo> veiculos) throws IOException {

        try (BufferedWriter writer = Files.newBufferedWriter(veiculosPath);
                CSVPrinter csvPrinter = new CSVPrinter(writer, veiculosCsvFormat);) {
            for (Veiculo v : veiculos) {
                csvPrinter.printRecord(v.getPlaca(), v.getMarca(), v.getCor(), v.getCategoria());
            }
            csvPrinter.flush();
        }

        return true;
    }
}