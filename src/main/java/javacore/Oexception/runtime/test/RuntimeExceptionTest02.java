package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
       divisao(1, 0);
    }
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (b == 0){
            throw new IllegalArgumentException("Argumento Ilegal, não pode ser 0");
        }
        return a/b;
    }
}
