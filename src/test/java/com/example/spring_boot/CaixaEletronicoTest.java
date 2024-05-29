package com.example.spring_boot;
import banco.Banco;
import banco.BancoImpl;
import caixa.CaixaEletronico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class CaixaEletronicoTest {

    @Test
    void testConsultarSaldoTotalMock() {

        Banco bancoMock = mock(Banco.class);

        when(bancoMock.getSaldoContaCorrente()).thenReturn(500.0);
        when(bancoMock.getSaldoContaPoupanca()).thenReturn(1000.0);

        CaixaEletronico caixaEletronico = new CaixaEletronico(bancoMock);

        assertEquals(1500.0, caixaEletronico.consultarSaldoTotal());
    }

    @Test
    void testConsultarSaldoTotalSpy() {

        Banco bancoSpy = spy(BancoImpl.class);

        when(bancoSpy.getSaldoContaCorrente()).thenReturn(500.0);

        CaixaEletronico caixaEletronico = new CaixaEletronico(bancoSpy);

        assertEquals(2500.0, caixaEletronico.consultarSaldoTotal());
    }
}
