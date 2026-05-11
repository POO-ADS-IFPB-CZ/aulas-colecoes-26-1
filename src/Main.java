import model.Pessoa;

void main() {

    String frase = IO.readln("Digite uma frase:");

    Arrays.stream(frase.toUpperCase().split(" "))
            .distinct()
            .sorted()
            .forEach(s -> System.out.println(s));

    /*
    A partir da frase, trazer palavras únicas em ordem crescente
    e caixa alta. Considerar sem pontuação.
     */

}