package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio08 {

    public static void main(String[] args) {
        int jogadoresTime1 = 6;
        int jogadoresTime2 = 10;

        if (jogadoresTime1 < 7 || jogadoresTime1 > 11 || jogadoresTime2 < 7 || jogadoresTime2 > 11) {
            System.out.println("Jogo deve ser interrompido");
        } else {
            System.out.println("Jogo pode continuar");
        }
    }
}
