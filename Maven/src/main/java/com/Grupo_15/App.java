package com.Grupo_15;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Exemplo simples de uso da API Apache Commons CVS
Extrair o arquivo commons-csv-1.7.jar para o diretorio do projeto
Para compilar no Windows: javac -cp .;.\commons-csv-1.7.jar App.java
Para compilar no Linux: javac -cp commons-csv-1.7.jar App.java
Para executar no windows: java -cp .;.\commons-csv-1.7.jar App
Para executar no Linux: java -cp .:commons-csv-1.7.jar App
Para executar: java -cp .;.\commons-csv-1.7.jar App.java
*/
public class App {
    //private static final String SAMPLE_CSV_FILE_PATH = "veiculos.dat";
    //private static final String SAMPLE_CSV_FILE_PATH2 = "motorista.dat";
    public enum FormaPagamento {DINHEIRO,CARTAO,TODAS;
}
    
    public static void main(String[] args) throws IOException {
       // try (
            //Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            //Reader reader2 = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH2));
            // CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            // CSVParser csvParser2 = new CSVParser(reader2, CSVFormat.DEFAULT);
        //) {
            // for (CSVRecord csvRecord : csvParser) {
            //     // Accessing Values by Column Index
            //     String placa = csvRecord.get(0);
            //     String marca = csvRecord.get(1);
            //     String cor = csvRecord.get(2);
            //     String categoria = csvRecord.get(3);

            //     System.out.println("Record No - " + csvRecord.getRecordNumber());
            //     System.out.println("---------------");
            //     System.out.println("Placa : " + placa);
            //     System.out.println("Marca : " + marca);
            //     System.out.println("Cor : " + cor);
            //     System.out.println("Categoria : " + categoria);
            //     System.out.println("---------------\n\n");
            // }

            // for (CSVRecord csvRecord : csvParser2){
            //     String cpf = csvRecord.get(0);
            //     String nome = csvRecord.get(1);
            //     //Veiculo veiculo = csvRecord.get(2);
            //     String FormaPagamento = csvRecord.get(3);


            //     System.out.println("Record No - " + csvRecord.getRecordNumber());
            //     System.out.println("---------------");
            //     System.out.println("Cpf : " + cpf);
            //     System.out.println("Nome : " + nome);
            //     //System.out.println("Veiculo : " + veiculo);
            //     System.out.println("Forma de Pagamento : " + FormaPagamento);
            //     System.out.println("---------------\n\n");
            // }
       // }
    }
}
