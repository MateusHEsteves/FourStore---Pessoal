package br.com.foursys.fourcamp.fourstore.communication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.controller.ProductController;
import br.com.foursys.fourcamp.fourstore.helper.Utils;
import br.com.foursys.fourcamp.fourstore.model.Produto;

public class MainMenu {
	//ProductController productC;
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Produto> produtos; // ProductController
	private static Map<Produto, Integer> carrinho;// ProductController
	
	//Cria e declara produtos e carrinho para gerar o mainMenu;
	public static void mainMenu() {
		produtos = new ArrayList<Produto>();
		carrinho = new HashMap<Produto, Integer>(); // ProductController
		MainMenu.menu();
	}
	
	//Começar o MENU de fato;
	private static void menu() {
		
		while(true) {
			
			System.out.println("=== Menu Principal ===");
			System.out.println("Selecione uma opção "
					+ "\n 1 - Cadastrar produtos"
					+ "\n 2 - Verificar disponibilidade no estoque (Listar produtos)"
					+ "\n 3 - Comprar produto"
					+ "\n 4 - Visualizar carrinho (Etapa de Finalizar Venda. *Se ater a diversos fatores.)"
					+ "\n 5 - Sair do sistema\n");
			
			
			Integer opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				MainMenu.cadastrarProduto(); //cadProduct
				break;
			case 2:
				MainMenu.listarProdutos(); //listProduct (quant)
				break;
			case 3:
				MainMenu.comprarProduto(); //selectProduct ou buyProduct
				break;
			case 4:
				MainMenu.visualizarCarrinho(); //Transactions?
				break;
			case 5:
				System.out.println("Volte sempre!");
				Utils.pausar(2);
				System.exit(0);
			default:
				System.out.println("Opção inválida!");
				Utils.pausar(2);
				MainMenu.menu();
				break;
			}
			
		}
	
	}
	
	private static void cadastrarProduto() {
		System.out.println("Cadastro de Produto");	
		System.out.println("====================");
		
		//DEBUGAR = No teste de mesa, só consigo separar as strings por underline, se usar espaço quebra.
		
		while (sc != null) {
		System.out.println("Informe o nome do produto: ");
		String nome = MainMenu.sc.next();
		
		System.out.println("Informe o preço do produto: \n*ATENÇÃO: Utilize vírgula (,) e não ponto (.) para os centavos.");
		Double preco = MainMenu.sc.nextDouble();
		
		System.out.println("Informe o tipo do produto: ");
		String tipo = MainMenu.sc.next();
		
		System.out.println("Informe o tamanho do produto: ");
		String tamanho = MainMenu.sc.next();
		
		System.out.println("Informe a cor do produto: ");
		String cor = MainMenu.sc.next(); 
		
		System.out.println("Informe a categoria do produto: ");
		String categoria = MainMenu.sc.next();
		
		System.out.println("Informe o departamento do produto: ");
		String departamento = MainMenu.sc.next();
		
		Produto produto = new Produto(nome, preco, tipo, tamanho, cor, categoria, departamento);
		
		MainMenu.produtos.add(produto);
		
		System.out.println("O produto " + produto.getNome() + " foi cadastrado com sucesso!");
		Utils.pausar(2);
		MainMenu.menu();
			
		} 
		
		sc.close();
		
		
	}
	
	private static void listarProdutos() {
		//System.out.println("Listando produto...");
		if(MainMenu.produtos.size() > 0) {
			System.out.println("Listagem de produtos: ");
			System.out.println();
			
			for(Produto p : MainMenu.produtos) {
				System.out.println(p);
				System.out.println();
			}
		} else {
			System.out.println("Ainda não há produtos cadastrados.");
		}
		
		Utils.pausar(2);
		MainMenu.menu();
	}
	
	private static void comprarProduto() {
		System.out.println("Comprando produto...");	
		//
		//
		// CONTINUAR DAQUI!!!!
		//
		//
	}

	private static void visualizarCarrinho() {
		//System.out.println("Visualizar carrinho...");
		if(MainMenu.carrinho.size() > 0) {
			System.out.println("Produtos no carrinho: ");
			
			for(Produto p : MainMenu.carrinho.keySet()) {
				System.out.println("Produto: " + p + "\nQuantidade" + MainMenu.carrinho.get(p));
			}
		}else {
			System.out.println("Ainda não há produtos no carrinho!");
		}
		
		Utils.pausar(2);
		MainMenu.menu();
	}

}


	//private static void cadProduct() {
		
	//Scanner sca = new Scanner(System.in);
		//System.out.println("Insira o sku do produto");
		//String sku = sca.nextLine();
		//System.out.println();
		//System.out.println("Insira a descrição do produto");
		//String description = sca.nextLine();
		
		//System.out.println("Insira a quantidade de entrada");
		//Integer qtt = sca.nextInt();
		
		//System.out.println("Insira o valor original(0 para manter o valor atual)");
		//Double originPrice = sca.nextDouble();
		
		//System.out.println("Insira o valor final do produto(0 para manter o valor atual)");
		//Double salePrice = sca.nextDouble();
		
		//System.out.println("Insira o tamanho do produto");
		//String size = sca.nextLine();
		
		//productC = new ProductController();
		//String retorno = productC.cadProduct(sku, description, qtt, originPrice, salePrice);
		//System.out.println(retorno);
		
	
