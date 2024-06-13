package br.com.teamcubation.exercicios.tiposvariaveis;
import java.util.ArrayList;


public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Ana");
        listaDeNomes.add("Bruno");
        listaDeNomes.add("Carla");
        listaDeNomes.add("Daniel");


        System.out.println("Nomes na lista: " + listaDeNomes);

        listaDeNomes.remove("Carla");

        System.out.println("Nomes na lista depois de remover: " + listaDeNomes);
    }
}
