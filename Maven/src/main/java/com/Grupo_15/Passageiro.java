package com.Grupo_15;

public class Passageiro {

    private String cpf;
    private String nome;
    private FormaPagamento formaPagamento;
    private String nroCartao;

    public Passageiro(String cpf, String nome, FormaPagamento formaPagamento, String nroCartao) {
        this.cpf = cpf;
        this.nome = nome;
        this.formaPagamento = formaPagamento;
        this.nroCartao = nroCartao;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public String getNroCartao() {
        return nroCartao;
    }
}