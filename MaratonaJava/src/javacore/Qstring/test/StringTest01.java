package javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Arthur"; //String constant pool
        String nome2 = "Arthur";
        nome = nome.concat("Nobre");
        System.out.println(nome == nome2);
        String nome3 = new String("Arthur"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
