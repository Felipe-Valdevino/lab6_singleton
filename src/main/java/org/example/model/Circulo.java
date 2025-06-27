package org.example.model;
import org.example.Exceptions.ValorInvalido;

public class Circulo implements FiguraGeometrica{

    private double raio;
    private final double pi = 3.14;
    private static Circulo circulo = null;

    private Circulo(int raioPar) throws ValorInvalido {
        raio=raioPar;
    }

    public static Circulo getInstance(int raioPar){
        if (circulo==null){
            circulo = new Circulo(raioPar);
        } else if(circulo.getRaio()!=raioPar){
            circulo.setRaio(raioPar);
        }
        return circulo;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio >0){
            this.raio = raio;
        } else {
            throw new ValorInvalido();
        }
    }

    @Override
    public double calculaArea() {
        return (2*pi*this.raio);
    }

    @Override
    public double calculaPerimetro() {
        return (pi*this.raio);
    }

}
