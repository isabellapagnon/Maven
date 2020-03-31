package com.Grupo_15;

public class Veiculo {

    private String placa;
    private String marca;
    private String cor;
    private CategoriaVeiculo categoria;

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
