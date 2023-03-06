package javacore.Gassociacao.dominio;

import java.sql.SQLOutput;

public class Seminario {
    private String titulo;
    private String endereço;
    private Aluno[] alunos;
    private Professor[] professores;

    public Seminario(String titulo, String endereço) {
        this.titulo = titulo;
        this.endereço = endereço;
    }

    public void imprime(){
        System.out.println("SEMINARIO");
        System.out.println(this.titulo + " " + this.endereço);
        System.out.println("------------------");
        System.out.println("PALESTRANTES");
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
            System.out.println("Especialidade: " + professor.getEspecialidade());
        }
        if (alunos == null) return;
        else{
            System.out.println("------------------");
            System.out.println("ALUNOS");
            for (Aluno aluno: alunos){
                System.out.println(aluno.getNome() + " " + aluno.getIdade());
            }
        }

    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
