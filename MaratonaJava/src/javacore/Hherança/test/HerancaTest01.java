package javacore.Hherança.test;

import javacore.Hherança.dominio.Endereco;
import javacore.Hherança.dominio.Funcionario;
import javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Rengoku");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Zenitsu");
        funcionario.setCpf("222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        System.out.println("---------------");
        funcionario.imprime();
    }
}
