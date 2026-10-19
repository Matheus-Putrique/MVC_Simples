
package model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoJava {

    private String nome;
    private double preco;
    private int id;

    private static List<ProdutoJava> produtos = new ArrayList<>();

    public ProdutoJava(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static List<ProdutoJava> getProdutos() {
        return produtos;
    }

    public static void adicionarProduto(ProdutoJava produto) {
        produtos.add(produto);
    }
}
