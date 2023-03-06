package javacore.Hherança.test;

import javacore.Hherança.dominio.Funcionario;

public class HerancaTest02 {
    // 0 -  Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe
    // 1 -  Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe
    // 2 -  Alocado espaço em memória pro objeto da superclasse
    // 3 -  Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
    // 4 -  Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 -  Construtor da superclasse é executado
    // 6 -  Alocado espaço em memória pro objeto da subclasse
    // 7 -  Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado da classe
    // 8 -  Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 -  Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");

    }
}
