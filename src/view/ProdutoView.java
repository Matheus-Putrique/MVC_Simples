
package view;

import java.util.List;
import java.util.Scanner;
import model.ProdutoJava;

public class ProdutoView {

    Scanner sc = new Scanner(System.in);

    public ProdutoJava cadastrarProduto() {
        System.out.println("=== Cadastro de Produto ===");

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preco: ");
        double preco = sc.nextDouble();

        return new ProdutoJava(id, nome, preco);
    }

    public void mostrarProduto(ProdutoJava produto) {
        System.out.println("\nProduto cadastrado!");
        System.out.println("ID: " + produto.getId());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());
    }

    public void listarProdutos(List<ProdutoJava> produtos) {
        System.out.println("\n=== Lista de Produtos ===");

        for (ProdutoJava produto : produtos) {
            mostrarProduto(produto);
            System.out.println("-------------------");
        }
    }

    public int mostrarMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== MENU ===");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Sair");
        System.out.print("Escolha: ");

        return sc.nextInt();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

}
