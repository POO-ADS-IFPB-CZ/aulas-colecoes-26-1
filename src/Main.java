import model.Pessoa;

void main() {

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("João",
            LocalDate.of(2003,10,4)));
    pessoas.add(new Pessoa("Maria",
            LocalDate.of(2010,2,15)));
    pessoas.add(new Pessoa("Ana",
            LocalDate.of(2002,3,10)));
    pessoas.add(new Pessoa("João",
            LocalDate.of(2003,10,4)));

    //como fazer...
    Set<Pessoa> conjunto = new HashSet<>();
    for(Pessoa pessoa: pessoas){
        conjunto.add(pessoa);
    }
    System.out.println(conjunto.size());

    //O que fazer...
    System.out.println(pessoas.stream().distinct().count());

    //pessoas.stream().forEach(o -> System.out.println(o));

    pessoas.stream()
            .distinct()
            .filter(o ->
                Period.between(o.getNascimento(),
                    LocalDate.now()).getYears()>=18)
            .forEach(o -> System.out.println(o));


}