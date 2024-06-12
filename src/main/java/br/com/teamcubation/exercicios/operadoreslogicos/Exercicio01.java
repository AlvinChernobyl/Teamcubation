package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio01 {

    public static void main(String[] args) {
        int golsTime1 = 2;
        int golsTime2 = 1;

        if (golsTime1 > golsTime2) {
            System.out.println("Time 1 é o vencedor.");
        } else if (golsTime1 < golsTime2) {
            System.out.println("Time 2 é o vencedor.");
        } else {
            System.out.println("O jogo terminou empatado.");
        }
    }
}
