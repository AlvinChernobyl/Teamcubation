package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio100 {  public static void main(String[] args) {
    String classificacao = "Libertadores";

    switch (classificacao) {
        case "Estadual":
            System.out.println("Irá começar na primeira fase");
            break;
        case "Libertadores":
            System.out.println("Irá começar na segunda fase");
            break;
        case "Campeão":
            System.out.println("Irá começar na terceira fase");
            break;
        default:
            System.out.println("Tente novamente o ano que vem!");
            break;
    }
}
}
