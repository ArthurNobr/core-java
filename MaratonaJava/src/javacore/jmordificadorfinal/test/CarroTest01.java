package javacore.jmordificadorfinal.test;

import javacore.jmordificadorfinal.dominio.Carro;
import javacore.jmordificadorfinal.dominio.Comprador;
import javacore.jmordificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Goku");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("488");
        ferrari.imprime();
    }
}
