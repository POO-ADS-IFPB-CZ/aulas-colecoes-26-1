import model.Pessoa;

void main() {

    Set<Pessoa> pessoas = new HashSet<>();
    pessoas.add(new Pessoa("João",
            LocalDate.of(2003,10,4)));
    pessoas.add(new Pessoa("Maria",
            LocalDate.of(2010,2,15)));
    pessoas.add(new Pessoa("Ana",
            LocalDate.of(2002,3,10)));

}