package com.example.spring_boot;
import ex.Banco;
import ex.CaixaEletronico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class CaixaEletronicoTest {

    @Test
    void tesMock() {

        Banco bancoMock = mock(Banco.class);

        when(bancoMock.getSaldoContaCorrente()).thenReturn(2000.0);
        when(bancoMock.getSaldoContaPoupanca()).thenReturn(3000.0);

        CaixaEletronico caixaEletronico = new CaixaEletronico(bancoMock);

        double total = caixaEletronico.calcularSaldoTotal();
        assertEquals(5000.0, total);
    }

    @Test
    void testSpy() {

        Banco bancoReal = new Banco();
        Banco bancoSpy = spy(bancoReal);

        when(bancoSpy.getSaldoContaCorrente()).thenReturn(2000.0);

        CaixaEletronico caixaEletronico = new CaixaEletronico(bancoSpy);

        double saldoTotal = caixaEletronico.calcularSaldoTotal();
        assertEquals(7000.0, saldoTotal);
    }
}
