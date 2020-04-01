package com.Grupo_15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class App {

    private static final String VEICULOS_CSV_FILE_PATH = "resources/veiculos.dat";
    private static final String MOTORISTAS_CSV_FILE_PATH = "resources/motoristas.dat";
    private static final String PASSAGEIROS_CSV_FILE_PATH = "resources/passageiros.dat";

    public static void main(String[] args) throws IOException {
        PersistenciaVeiculos pv = new PersistenciaVeiculos(Paths.get(VEICULOS_CSV_FILE_PATH));
        List<Veiculo> veiculos = pv.carregaVeiculos();

        PersistenciaMotoristas pm = new PersistenciaMotoristas(Paths.get(MOTORISTAS_CSV_FILE_PATH), veiculos);
        List<Motorista> motoristas = pm.carregaMotoristas();

        PersistenciaPassageiros pp = new PersistenciaPassageiros(Paths.get(PASSAGEIROS_CSV_FILE_PATH));
        List<Passageiro> passageiros = pp.carregaPassageiros();

        Veiculo v = new Veiculo("NLP2X31", "RENAULT", "VERMELHO", CategoriaVeiculo.LUXO);
        Motorista m = new Motorista("12345678910", "Felipe", v, FormaPagamento.CARTAO);
        Passageiro p = new Passageiro("98765432110", "Gabriela", FormaPagamento.DINHEIRO, "675848");

        veiculos.add(v);
        motoristas.add(m);
        passageiros.add(p);

        pv.persisteVeiculos(veiculos);
        pm.persisteMotoristas(motoristas);
        pp.persistePassageiros(passageiros);

        System.out.println("Successo");
    }
}