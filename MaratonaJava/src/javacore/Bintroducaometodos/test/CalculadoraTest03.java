package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,2));
        System.out.println("---------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);




        //    Outra forma de executar sem a variável result
    //    System.out.println(calculadora.divideDoisNumeros(20,2));
    }
}
