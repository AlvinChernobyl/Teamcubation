package ex;

public class CaixaEletronico {
    private Banco banco;

    public CaixaEletronico(Banco banco) {
        this.banco = banco;
    }

    public double calcularSaldoTotal() {
        double saldoCorrente = banco.getSaldoContaCorrente();
        double saldoPoupanca = banco.getSaldoContaPoupanca();
        return saldoCorrente + saldoPoupanca;
    }
}
