package javacore.Zgenerics.service;

import javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponivel...");
        Barco Barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: "+Barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);
        return Barco;
    }

    public void retornarBarcoAlugado(Barco Barco){
        System.out.println("Devolvendo Barco "+Barco);
        barcosDisponiveis.add(Barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
