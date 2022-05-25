package br.com.fourstore.controller;

import java.util.List;
import java.util.Scanner;

import br.com.fourstore.model.Produto;
import br.com.fourstore.service.ProdutoService;

public class MenuController {

	private Scanner scanner = new Scanner(System.in);

	ProdutoService productService = new ProdutoService();

	public MenuController(String opcao) {
		System.out.println("Programa foi inicializado pela " + opcao + "ª opção");
		inicializeMenu();
	}

	private void inicializeMenu() {
		while (true) {

			Integer opcao = menuPrincipal();

			switch (opcao) {
			case 1:
				cadastrarProduto();
				continue;
				
			case 2:
				updateEstoque();
				continue;
			case 3:
				findAllProdutos();
				continue;

			default:
				break;
			}
		}
	}

	/**
	 * Exibe um menu no console e solicita uma entrada do tipo inteiro usando o
	 * Scanner e retorna essa entrada.
	 * 
	 * @return Integer inputado pelo usuário do sistema.
	 */
	public Integer menuPrincipal() {
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║             × Menu Inicial ×             ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - Cadastrar Produto                  ║");
		System.out.println("║ » 2 - Atualizar Estoque                  ║");
		System.out.println("║ » 3 - Listar Estoque                     ║");
		System.out.println("║ » 4 - Comprar Produto                    ║");
		System.out.println("║ » 5 - Exibir Histórico                   ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 0 - Sair Sistema                       ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer opcao = scanner.nextInt();
		scanner.nextLine();
		return opcao;
	}

	/**
	 * Cadastra um novo produto
	 */
	public void cadastrarProduto() {

		Integer sku = Integer.parseInt(readString("Informe o Sku: "));
		String nome = readString("Informe o nome: ");
		Double preco = Double.parseDouble(readString("Informe o preço: "));
		String tamanho = readString("Informe o tamanho: ");
		String cor = readString("Informe a cor: ");
		Integer quantidade = Integer.parseInt(readString("Informe a quantidade: "));
		String tipo = readString("Informe o tipo: ");
		String descricao = readString("Informe a descrição: ");
		String categoria = readString("Informe a categoria: ");
		String departamento = readString("Informe o departamento: ");

		Produto product = new Produto(sku, nome, preco, tamanho, cor, quantidade, tipo, descricao, categoria,
				departamento);

		productService.create(product);

	}

	private String readString(String mensagem) {
		System.out.print(mensagem);
		String retorno = scanner.nextLine();
		return retorno;
	}

	public List<Produto> findAllProdutos() {
		List<Produto> estoqueList = productService.readAll();
		for (Produto produto : estoqueList) {
			System.out.println(produto);
		}	
		return productService.readAll();
	}
	
	public void updateEstoque() {
		System.out.println("Informe o sku do produto a ser alterado: ");
		Integer sku = scanner.nextInt();
		scanner.nextLine();	
		Produto produtoASerAlterado = productService.readBySku(sku);
		System.out.println("Informe a quantidade do produto a ser alterado: ");
		Integer quantidade = (produtoASerAlterado.getQuantidade() + scanner.nextInt());
		scanner.nextLine();		
		produtoASerAlterado.setQuantidade(quantidade);
		productService.update(produtoASerAlterado);
		System.out.println("Produto atualizado com sucesso! ");
	}
}
