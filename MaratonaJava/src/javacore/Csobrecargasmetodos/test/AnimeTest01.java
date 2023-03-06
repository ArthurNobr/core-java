package javacore.Csobrecargasmetodos.test;

import javacore.Csobrecargasmetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Demon Slayer","TV",12);
        anime.init("Demon Slayer", "TV", 12, "Ação");
        anime.imprime();
    }
}
