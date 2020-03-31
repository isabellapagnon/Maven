package com.Grupo_15;

public class Motorista {

    private String cpf;
    private String nome;
    private Veiculo veiculo;
    private FormaPagamento formaPagamento;

    public Motorista(String cpf, String nome, Veiculo veiculo, FormaPagamento formaPagamento) {
        this.cpf = cpf;
        this.nome = nome;
        this.veiculo = veiculo;
        this.formaPagamento = formaPagamento;
    }

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