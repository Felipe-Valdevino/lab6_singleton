package org.example.model;

import org.example.Exceptions.ValorInvalido;

public class Triangulo implements FiguraGeometrica{
    private int lado1;
    private int lado2;
    private int lado3;
    private static Triangulo escaleno = null;
    private static Triangulo equilatero = null;
    private static Triangulo isoceles = null;

    private Triangulo(int lado) {
        lado1 = lado;
        lado2 = lado;
        lado3 = lado;
    }

    private Triangulo(int lado, int ladoDiff) {
        if((lado*2)>ladoDiff && (lado+ladoDiff)>lado){
            lado1 = lado;
            lado2 = lado;
            lado3 = ladoDiff;
        } else{
            throw new ValorInvalido();
        }

    }

    private Triangulo(int ladoPar1, int ladoPar2, int ladoPar3) {
        if ((ladoPar1 != ladoPar2) && (ladoPar2 != ladoPar3) && (ladoPar1 != ladoPar3)) {
            if ((ladoPar1 + ladoPar2) > ladoPar3 && (ladoPar1 + ladoPar3) > ladoPar2 && (ladoPar2 + ladoPar3) > ladoPar1) {
                this.lado1 = ladoPar1;
                this.lado2 = ladoPar2;
                this.lado3 = ladoPar3;
            } else {
                throw new ValorInvalido();
            }
        }
    }

    public static Triangulo getInstance(int lado) {
        if (equilatero == null) {
            equilatero = new Triangulo(lado);
        }
        return equilatero;
    }

    public static Triangulo getInstance(int lado, int ladoDiff) {
        if (isoceles == null) {
            isoceles = new Triangulo(lado, ladoDiff);
        }
        return isoceles;
    }

    public static Triangulo getInstance(int lado1, int lado2, int lado3) {
        if (escaleno == null) {
            escaleno = new Triangulo(lado1, lado2, lado3);
        }
        return escaleno;
    }

    @Override
    public double calculaArea() {
        // Fórmula de Heron
        double s = calculaPerimetro() / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calculaPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
