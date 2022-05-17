package br.com.foursys.fourcamp.fourstore.communication;

import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.controller.ProductController;

public class MainMenu {
	ProductController productC;
	
	//exibe o menu
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("=== Menu Principal ===");
			System.out.println("Selecione uma opção "
					+ "\n 1 - Cadastrar produtos"
					+ "0 - Sair\n");
			Integer opcao = sc.nextInt();
			
			
			switch (opcao) {
			case 1:
				cadProduct();
				break;
			case 0:
				
				break;
			}
			
		}
	
		
	}

	private void cadProduct() {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Insira o sku do produto");
		String sku = sca.nextLine();
		System.out.println();
		System.out.println("Insira a descrição do produto");
		String description = sca.nextLine();
		
		System.out.println("Insira a quantidade de entrada");
		Integer qtt = sca.nextInt();
		
		System.out.println("Insira o valor original(0 para manter o valor atual)");
		Double originPrice = sca.nextDouble();
		
		System.out.println("Insira o valor final do produto(0 para manter o valor atual)");
		Double salePrice = sca.nextDouble();
		
		System.out.println("Insira o tamanho do produto");
		String size = sca.nextLine();
		
		productC = new ProductController();
		String retorno = productC.cadProduct(sku, description, qtt, originPrice, salePrice);
		System.out.println(retorno);
		
		
	}
}
