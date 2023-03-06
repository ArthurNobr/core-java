package javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Willian Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("Willian", "David", "Harisson");
        List<String> studets = List.of("Édipo", "Gustavo Mendes", "Lucas", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(studets);

        for (List<String> people : devdojo){
            for (String person : people){
                System.out.println(person);
            }
        }
        System.out.println("-----------------");
         devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
