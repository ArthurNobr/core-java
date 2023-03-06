package javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Arthur");
        lista.add("Nobre");

        for (String s : lista) {
            System.out.println(s);
        }


    }

}
