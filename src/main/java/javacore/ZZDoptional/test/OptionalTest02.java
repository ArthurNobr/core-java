package javacore.ZZDoptional.test;

import javacore.ZZDoptional.dominio.Manga;
import javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElse(new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
