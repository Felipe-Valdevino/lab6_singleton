package org.example.model;

import org.example.Exceptions.ValorInvalido;

public class Quadrado implements FiguraGeometrica{
    private double lado;

    public Quadrado(double ladoQuadrado) throws ValorInvalido {
        if (ladoQuadrado>0){
            this.lado = ladoQuadrado;
        } else {
            throw new ValorInvalido();
        }
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calculaArea() {
        return (this.lado*this.lado);
    }

    @Override
    public double calculaPerimetro() {
        return (4*this.lado);
    }
    
}