package model;

import java.util.*;

public class Supermercado {

    private String cnpj;
    private String nome;
    private Set<Produto> estoque;

    public Supermercado(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        estoque = new HashSet<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean createProduto(Produto produto){
        return estoque.add(produto);
    }

    public Set<Produto> readProdutos(){
        return estoque;
    }

    public boolean deleteProduto(Produto produto){
        return estoque.remove(produto);
    }

    public boolean atualizar(Produto produto){
        return deleteProduto(produto) && createProduto(produto);
    }

}
