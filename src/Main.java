import model.Comando;
import model.Controlador;

void main() {

    Controlador controlador = new Controlador();

    controlador.adicionar(
            new Comando("Adicionar", "Bom dia,\n")
    );
    controlador.adicionar(
            new Comando("Adicionar", "Aula POO\n")
    );

    controlador.desfazer();

}
