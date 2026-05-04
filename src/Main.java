import model.Produto;
import model.Supermercado;

void main() {

    Supermercado supermercado = new Supermercado("123",
            "Cajazeiras");
    supermercado.createProduto(new Produto(1,"Arroz",
            4.5f));
    supermercado.createProduto(new Produto(2, "Feijão",
            8));
    supermercado.createProduto(new Produto(3, "Macarrão",
            3));
    System.out.println(supermercado.readProdutos());

}
