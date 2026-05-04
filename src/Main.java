import model.Fila;
import model.Produto;
import model.Supermercado;

void main() {

    //TODO: fazer o menu para esse programa
    //TODO: Adicionar prioridades
    Fila fila = new Fila();
    System.out.println("Nova ficha: "+fila.novaFicha());
    System.out.println("Nova ficha: "+fila.novaFicha());
    System.out.println("Nova ficha: "+fila.novaFicha());
    System.out.println("Nova ficha: "+fila.novaFicha());

    System.out.println("Ver próximo "+fila.verificarProximo());
    System.out.println("Chamar: "+fila.chamarProximo());
    System.out.println("Ver próximo "+fila.verificarProximo());

}
