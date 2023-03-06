package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Seminario seminario1 = new Seminario("Ted Talks", "Uncisal");
        Seminario seminario2 = new Seminario("Real Politics", "Ufal");
        Aluno aluno1 = new Aluno("João", 19);
        Aluno aluno2 = new Aluno("Lucas", 22);
        Aluno aluno3 = new Aluno("Maria", 24);
        Professor professor1 = new Professor("Marcos", "Engenharia");
        Professor professor2 = new Professor("Paulo", "Arquiteto");
        Aluno[] alunos = {aluno1, aluno2, aluno3};
        Professor[] professores = {professor1, professor2};

        seminario1.setAlunos(alunos);
        seminario1.setProfessores(professores);

        seminario2.setProfessores(professores);

        seminario1.imprime();
        System.out.println("##---------------##");
        seminario2.imprime();




    }
}
