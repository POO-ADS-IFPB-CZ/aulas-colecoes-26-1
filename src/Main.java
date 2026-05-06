import model.Pessoa;

void main() {

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("João",
            LocalDate.of(2003,10,4)));
    pessoas.add(new Pessoa("Maria",
            LocalDate.of(2000,2,15)));
    pessoas.add(new Pessoa("Ana",
            LocalDate.of(2002,3,10)));

    //Classe interna anônima
    Collections.sort(pessoas, new Comparator<Pessoa>(){
        @Override
        public int compare(Pessoa o1, Pessoa o2){
            return o1.getNome().compareTo(o2.getNome());
        }
    });
    System.out.println(pessoas);
}
//Classe interna
class ComparadorPessoaNome implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
