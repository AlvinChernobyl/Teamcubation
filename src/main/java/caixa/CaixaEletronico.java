package caixa;

import banco.Banco;

public class CaixaEletronico {
    private Banco banco;

    public CaixaEletronico(Banco banco) {
        this.banco = banco;
    }

    public double consultarSaldoTotal() {
        double saldoContaCorrente = banco.getSaldoContaCorrente();
        double saldoContaPoupanca = banco.getSaldoContaPoupanca();
        return saldoContaCorrente + saldoContaPoupanca;
    }
}
