package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio2 {

    public static void main(String[] args) {
        int numeroCamisa = 7;

        if (numeroCamisa == 1) {
            System.out.println("Goleiro");
        } else if (numeroCamisa >= 2 && numeroCamisa <= 5) {
            System.out.println("Defensor");
        } else if (numeroCamisa == 6 || numeroCamisa == 7 || numeroCamisa == 8 || numeroCamisa == 10) {
            System.out.println("Meio-campo");
        } else if (numeroCamisa == 9 || numeroCamisa == 11) {
            System.out.println("Atacante");
        } else {
            System.out.println("Número de camisa desconhecido");
        }
    }
}
