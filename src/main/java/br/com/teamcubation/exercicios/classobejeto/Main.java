package br.com.teamcubation.exercicios.classobejeto;
public class Main {

    public static void main(String[] args) {

        MinhaClasse objeto1 = new MinhaClasse(10);

        MinhaClasse objeto2 = new MinhaClasse(20);

        objeto1.setValor(15);

        System.out.println("Valor do objeto1: " + objeto1.getValor());
        System.out.println("Valor do objeto2: " + objeto2.getValor());
    }
}
