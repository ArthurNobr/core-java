package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Consumidor;
import javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Attack on titan",19.9,0));
        mangas.add(new Manga(1L,"Berserk", 9.6,5));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2,0));
        mangas.add(new Manga(3L,"Pokemon", 11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99,0));
        mangas.add(new Manga(2L, "Aaragon", 10.00, 1));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
