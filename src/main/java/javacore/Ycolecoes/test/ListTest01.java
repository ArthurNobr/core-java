package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Arthur");
        nomes.add("Demon Slayer");
        nomes2.add("Goku");
        nomes2.add("Vegeta");

//        nomes.remove("Arthur");
        nomes.addAll(nomes2);

        for (String nome : nomes){
            System.out.println(nome);
        }
        nomes.add("Nobre");
        System.out.println("----------------");
        for (int i = 0; i < nomes.size(); i ++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>(16);
        numeros.add(1);
    }
}
