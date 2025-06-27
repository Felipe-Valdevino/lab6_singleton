package classes;

import org.example.Exceptions.ValorInvalido;
import org.example.model.Triangulo;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrianguloTest {

    @Test(expected = ValorInvalido.class)
    public void testCriacaoIsocelesInvalido() {
        Triangulo.getInstance(1, 10);
    }

    @Test(expected = ValorInvalido.class)
    public void testCriacaoEscalenoInvalido() {
        Triangulo.getInstance(1, 2, 20);
    }

    @Test
    public void testCalculoAreaEquilatero() {
        Triangulo t = Triangulo.getInstance(6);
        double area = t.calculaArea();
        assertEquals(15.59, area, 0.1);
    }

    @Test
    public void testCriacaoEquilateroSingleton() {
        Triangulo t1 = Triangulo.getInstance(3);
        Triangulo t2 = Triangulo.getInstance(3);
        assertSame(t1, t2);
    }

    @Test
    public void testCriacaoIsocelesSingleton() {
        Triangulo t1 = Triangulo.getInstance(4, 6);
        Triangulo t2 = Triangulo.getInstance(4, 6);
        assertSame(t1, t2);
    }

    @Test
    public void testCriacaoEscalenoSingleton() {
        Triangulo t1 = Triangulo.getInstance(5, 6, 7);
        Triangulo t2 = Triangulo.getInstance(5, 6, 7);
        assertSame(t1, t2);
    }

    @Test
    public void testCalculoPerimetroEquilatero() {
        Triangulo t = Triangulo.getInstance(6);
        assertEquals(18.0, t.calculaPerimetro(), 0.001);
    }

    @Test
    public void testCalculoAreaIsoceles() {
        Triangulo t = Triangulo.getInstance(5, 6);
        double area = t.calculaArea();
        assertEquals(12.0, area, 1.0);
    }

    @Test
    public void testCalculoAreaEscaleno() {
        Triangulo t = Triangulo.getInstance(7, 8, 9);
        double area = t.calculaArea();
        assertEquals(26.83, area, 0.1);
    }

    @Test
    public void testCalculoPerimetroEscaleno() {
        Triangulo t = Triangulo.getInstance(7, 8, 9);
        assertEquals(24.0, t.calculaPerimetro(), 0.001);
    }
}
