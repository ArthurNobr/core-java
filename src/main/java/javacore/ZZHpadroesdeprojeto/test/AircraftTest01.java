package javacore.ZZHpadroesdeprojeto.test;

import javacore.ZZHpadroesdeprojeto.dominio.Aircraft;
import javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
//        Aircraft aircraft = new Aircraft("787-900");
//        System.out.println(aircraft.bookSeat(seat));
    }
}
