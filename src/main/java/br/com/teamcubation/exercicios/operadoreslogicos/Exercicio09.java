package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio09 {

    public static void main(String[] args) {
        int jogosSeguidos = 5;
        boolean adversarioInferior = true;
        boolean jogoClassificatorioImportante = false;

        if (jogosSeguidos >= 5 && (adversarioInferior || jogoClassificatorioImportante)) {
            System.out.println("O jogador deve ser poupado");
        } else {
            System.out.println("O jogador não deve ser poupado");
        }
    }
}
