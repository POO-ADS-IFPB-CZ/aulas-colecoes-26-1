import model.Pessoa;

void main() {

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("João",
            LocalDate.of(2003,10,4)));
    pessoas.add(new Pessoa("Maria",
            LocalDate.of(2000,2,15)));
    pessoas.add(new Pessoa("Ana",
            LocalDate.of(2002,3,10)));

    Collections.sort(pessoas, (o1, o2)->
         o1.getNome().compareTo(o2.getNome())
    );
    System.out.println(pessoas);
    Collections.sort(pessoas, Comparator
            .comparing(Pessoa::getNascimento));
    System.out.println(pessoas);
}