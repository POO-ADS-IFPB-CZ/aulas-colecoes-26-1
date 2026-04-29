package model;

import java.util.List;

public class Turma {

    private String disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(String disciplina, Professor professor, List<Aluno> alunos) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public boolean adicionar(Aluno aluno){
        return alunos.add(aluno);
    }

    public boolean remover(Aluno aluno){
        return alunos.remove(aluno);
    }

}
