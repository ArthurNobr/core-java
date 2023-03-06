package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "GTR-R35";
        carro1.modelo = "Nissan";
        carro1.ano = 2020;

        carro2.nome = "WRX-STI";
        carro2.modelo = "Subaru";
        carro2.ano = 2021;

        carro1 = carro2;

        System.out.println("O primeiro carro e o :" + carro1.nome + " modelo:" + carro1.modelo + " ano:" + carro1.ano);
        System.out.println("O segundo carro e o :" + carro2.nome + " modelo:" + carro2.modelo + " ano:" + carro2.ano);
    }
}
