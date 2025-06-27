package classes;

import org.example.Exceptions.ValorInvalido;
import org.example.model.Circulo;
import org.junit.Test;

import static org.junit.Assert.*;

public class CirculoTest {

    @Test
    public void testCriacaoCirculoSingleton() {
        Circulo c1 = Circulo.getInstance(5);
        Circulo c2 = Circulo.getInstance(5);
        assertSame(c1, c2);
    }

    @Test
    public void testAtualizacaoRaioEmSingleton() {
        Circulo c = Circulo.getInstance(5);
        c.setRaio(10);
        assertEquals(10.0, c.getRaio(), 0.001);
    }

    @Test(expected = ValorInvalido.class)
    public void testRaioInvalido() {
        Circulo c = Circulo.getInstance(1);
        c.setRaio(-2); // deve lançar exceção
    }

    @Test
    public void testCalculoArea() {
        Circulo c = Circulo.getInstance(5);
        c.setRaio(3);
        assertEquals(18.84, c.calculaArea(), 0.01);
    }

    @Test
    public void testCalculoPerimetro() {
        Circulo c = Circulo.getInstance(5);
        c.setRaio(3);
        assertEquals(9.42, c.calculaPerimetro(), 0.01);
    }
}
