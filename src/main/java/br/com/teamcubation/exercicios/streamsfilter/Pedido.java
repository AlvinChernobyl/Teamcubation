package br.com.teamcubation.exercicios.streamsfilter;

public class Pedido {
    private String produto;
    private double valor;
    private int quantidade;

    public Pedido(String produto, double valor, int quantidade) {
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "produto='" + produto + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
