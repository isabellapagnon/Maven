package com.Grupo_15;
// import org.apache.commons.csv.CSVFormat;
// import org.apache.commons.csv.CSVParser;
// import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Motorista{
String cpf;
String nome;
Veiculo veiculo;
FormaPagamento formaPagamento;
public enum FormaPagamento {DINHEIRO,CARTAO,TODAS;}

public String getCpf() {
    return cpf;
}

public String getNome() {
    return nome;
}

public Veiculo getVeiculo() {
    return veiculo;
}

public FormaPagamento getFormaPagamento() {
    return formaPagamento;
}

} 