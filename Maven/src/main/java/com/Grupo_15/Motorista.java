package com.Grupo_15;

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