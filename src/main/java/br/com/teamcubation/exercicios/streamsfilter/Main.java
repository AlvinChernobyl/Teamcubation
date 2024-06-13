package br.com.teamcubation.exercicios.streamsfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Notebook", 2500.0, 1));
        pedidos.add(new Pedido("Celular", 800.0, 15));
        pedidos.add(new Pedido("Tablet", 1200.0, 5));
        pedidos.add(new Pedido("Mouse", 50.0, 20));


        List<Pedido> pedidosAcimaDe1000 =
                pedidos.stream()
                        .filter(pedido -> pedido.getValor() > 1000.0)
                        .collect(Collectors.toList());

        System.out.println("Pedidos com valores acima de 1000 reais:");
        pedidosAcimaDe1000.forEach(System.out::println);
        System.out.println();


        List<Pedido> pedidosQuantidadeAcimaDe10 =
                pedidos.stream()
                        .filter(pedido -> pedido.getQuantidade() > 10)
                        .collect(Collectors.toList());

        System.out.println("Pedidos com quantidade acima de 10 itens:");
        pedidosQuantidadeAcimaDe10.forEach(System.out::println);
        System.out.println();


        List<Pedido> pedidosAcimaDe1000EQuantidadeAcimaDe10 =
                pedidos.stream()
                        .filter(pedido -> pedido.getValor() > 1000.0 && pedido.getQuantidade() > 10)
                        .collect(Collectors.toList());

        System.out.println("Pedidos com valores acima de 1000 reais e quantidade acima de 10 itens:");
        pedidosAcimaDe1000EQuantidadeAcimaDe10.forEach(System.out::println);
    }
}
