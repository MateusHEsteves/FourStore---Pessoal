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
		//System.out.println("Comprando produto...");	
		if(MainMenu.produtos.size() > 0) {
			System.out.println("Informe o código do produto que deseja comprar: ");
			System.out.println();
			
			System.out.println("================= Produtos Disponíveis =================");
			for(Produto q : MainMenu.produtos) {
				System.out.println(q);
				System.out.println("--------------------------------");
			}
			int codigo = Integer.parseInt(MainMenu.sc.next());
			boolean tem = false;
			
			for(Produto q : MainMenu.produtos) {
				if(q.getCodigo() == codigo) {
					int quant = 0;
					try {
						quant = MainMenu.carrinho.get(q);
						// Já tem esse produto no carrinho, atualiza a quantidade.
						MainMenu.carrinho.put(q, quant+1); //(q, quant + 1)
					} catch(NullPointerException e) {
						// Primeiro produto no carrinho
						MainMenu.carrinho.put(q, 1);
					}
					System.out.println("O produto " + q.getNome() + " foi adicionado ao carrinho.");
					tem = true;
				}
				if(tem) {
					System.out.println("Deseja adicionar outro pedido no carrinho? ");
					System.out.println("Infome 1 para SIM, ou 0 para NÃO: ");
					int op = Integer.parseInt(MainMenu.sc.next());
					
					if(op == 1) {
						MainMenu.comprarProduto();
					}else {
						System.out.println("Por favor, aguarde enquanto fechamos seu pedido...");
						Utils.pausar(2);
						MainMenu.fecharPedido();
					}
				}else {
					System.out.println("Não foi encontrado o produto com o código " + codigo);
					Utils.pausar(2);
					MainMenu.menu();
					
				}
			}
		} else {
			System.out.println("Ainda não existe produto cadastrado no mercado.");
			Utils.pausar(2);
			MainMenu.menu();
		}
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
	
	private static void fecharPedido() {
		Double valorTotal = 0.0;
		System.out.println("Produtos do carrinho: ");
		System.out.println("-------------------------");
		for(Produto p : MainMenu.carrinho.keySet()) {
			int quant = MainMenu.carrinho.get(p);
			valorTotal += p.getPreco() * quant;
			System.out.println(p);
			System.out.println("Quantidade: " + quant);
			System.out.println("---------------------");
		}
		System.out.println("Sua fatura é " + Utils.doubleParaString(valorTotal));
		MainMenu.carrinho.clear();
		System.out.println("Obrigado pela preferência.");
		Utils.pausar(4);
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
		
	
