package javacore.ZZHpadroesdeprojeto.test;

import javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Arthur")
                .lastName("Nobre")
                .userName("SlimShady")
                .email("arthurnunes.al@gmail.com")
                .build();
        System.out.println(build);
    }
}
