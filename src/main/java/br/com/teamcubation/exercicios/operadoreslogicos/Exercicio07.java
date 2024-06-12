package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio07 {

    public static void main(String[] args) {
        int penaltis = 3;
        int expulsoes = 1;
        int consultasVAR = 4;

        if (penaltis > 2 && expulsoes >= 1 && consultasVAR > 3) {
            System.out.println("Jogo suspeito de manipulação");
        } else {
            System.out.println("Jogo sem suspeitas de manipulação");
        }
    }
}
