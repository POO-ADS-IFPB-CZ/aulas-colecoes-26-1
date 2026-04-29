import model.Aluno;
import model.Professor;
import model.Turma;

void main() {

    Professor professor = new Professor("123.123.123-01",
            "João", 2000);
    Turma turma = new Turma("POO",professor,
            new ArrayList<>());
    turma.adicionar(new Aluno("123","Pedro"));
    turma.adicionar(new Aluno("312", "Maria"));
    turma.adicionar(new Aluno("456", "Ana"));

    turma.remover(new Aluno("123", "Pedro"));


}
