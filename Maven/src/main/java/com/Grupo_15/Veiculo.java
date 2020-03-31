package com.Grupo_15;
// import org.apache.commons.csv.CSVFormat;
// import org.apache.commons.csv.CSVParser;
// import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.*;

public class Veiculo {

    public enum CategoriaVeiculo { SIMPLES, NORMAL, LUXO };
    String placa;
    String marca;
    String cor;
    CategoriaVeiculo categoria;

    public Veiculo(String placa, String marca, String cor, CategoriaVeiculo categoria) {
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public CategoriaVeiculo getCategoria() {
        return categoria;
    }

}