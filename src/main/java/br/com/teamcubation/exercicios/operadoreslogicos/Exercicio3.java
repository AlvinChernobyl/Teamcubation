package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio3 {
    public static void main(String[] args) {
        int golsFeitos = 5;
        int golsSofridos = 3;
        int saldoGols = golsFeitos - golsSofridos;

        if (saldoGols > 0) {
            System.out.println("Saldo positivo");
        } else if (saldoGols < 0) {
            System.out.println("Saldo negativo");
        } else {
            System.out.println("Saldo neutro");
        }
    }
}
