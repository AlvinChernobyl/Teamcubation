package banco;

public class BancoImpl implements Banco {
    @Override
    public double getSaldoContaCorrente() {
        return 1000.0;
    }

    @Override
    public double getSaldoContaPoupanca() {
        return 2000.0;
    }
}
