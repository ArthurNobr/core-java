package javacore.ZZHpadroesdeprojeto.test;

import javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;
import javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonEager.getInstance());
        System.out.println(AircraftSingletonEager.getInstance());
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
