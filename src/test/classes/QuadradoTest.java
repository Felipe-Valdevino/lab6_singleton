package classes;
import org.example.Exceptions.ValorInvalido;
import org.example.model.Quadrado;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadradoTest {

    @Test
    public void testCriacaoQuadradoValido() {
        Quadrado q = new Quadrado(4);
        assertEquals(4.0, q.getLado(), 0.001);
    }

    @Test(expected = ValorInvalido.class)
    public void testCriacaoQuadradoInvalido() {
        new Quadrado(0);
    }

    @Test
    public void testCalculoArea() {
        Quadrado q = new Quadrado(3);
        assertEquals(9.0, q.calculaArea(), 0.001);
    }

    @Test
    public void testCalculoPerimetro() {
        Quadrado q = new Quadrado(2.5);
        assertEquals(10.0, q.calculaPerimetro(), 0.001);
    }
}
