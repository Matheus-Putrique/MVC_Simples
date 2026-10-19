
package controller;

import model.ProdutoJava;
import view.ProdutoView;

public class ProdutoController {

    ProdutoView view = new ProdutoView();

    public void cadastrarProduto() {
        ProdutoJava produto = view.cadastrarProduto();

        ProdutoJava.adicionarProduto(produto);

        view.mostrarProduto(produto);
    }

    public void listarProdutos() {
        view.listarProdutos(ProdutoJava.getProdutos());
    }

    public void iniciar() {
        int opcao = 0;

        while (opcao != 3) {
            opcao = view.mostrarMenu();

            if (opcao == 1) {
                cadastrarProduto();
            } else if (opcao == 2) {
                listarProdutos();
            } else if (opcao == 3) {
                view.exibirMensagem("Encerrando o programa...");
            } else {
                view.exibirMensagem("Opcao invalida!");
            }
        }
    }

}
