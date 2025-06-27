package org.example;

import org.example.Exceptions.ValorInvalido;
import org.example.model.Circulo;
import org.example.model.Quadrado;
import org.example.model.Triangulo;

public class Main {
    public static void main(String[] args) throws ValorInvalido {

        double perimetro;
        double area;

        System.out.println("DADOS PRÉ-INSERIDOS 1:\n");
        //Informações do Circulo
        try{
            perimetro = Circulo.getInstance(25).calculaPerimetro();
            System.out.println("O perimetro do circulo é: "+perimetro);

            area = Circulo.getInstance(25).calculaArea();
            System.out.println("A área do circula: "+area);

        } catch (ValorInvalido exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("\n----------------------------------------------------------------\n");

        //Informações do Quadrado
        Quadrado quadrado;
        try{
            quadrado = new Quadrado(7);
            perimetro = quadrado.calculaPerimetro();
            System.out.println("O perimetro do circulo é: " + perimetro);

            area = quadrado.calculaArea();
            System.out.println("A área do quadrado: " + area);

        } catch (ValorInvalido exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("\n----------------------------------------------------------------\n");

        //Informações Triangulo Equilatero
        try {
            perimetro = Triangulo.getInstance(7).calculaPerimetro();
            System.out.println("O perimetro do retangulo é: "+perimetro);

            area = Triangulo.getInstance(7).calculaArea();
            System.out.println("A área do retangulo: "+area);

        } catch (ValorInvalido exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("\n----------------------------------------------------------------\n");

        //Informações Triangulo escaleno
        try {
            perimetro = Triangulo.getInstance(6,4).calculaPerimetro();
            System.out.println("O perimetro do retangulo é: "+perimetro);

            area = Triangulo.getInstance(6,4).calculaArea();
            System.out.println("A área do retangulo: "+area);

        } catch (ValorInvalido exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("\n----------------------------------------------------------------\n");

        //Informações Triangulo Equilatero
        try {
            perimetro = Triangulo.getInstance(5, 6, 7).calculaPerimetro();
            System.out.println("O perimetro do retangulo é: "+perimetro);

            area = Triangulo.getInstance(5, 6, 7).calculaArea();
            System.out.println("A área do retangulo: "+area);

        } catch (ValorInvalido exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("\n----------------------------------------------------------------\n");


    }
}