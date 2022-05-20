package br.com.foursys.fourcamp.fourstore.communication;

import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.controller.ProductController;

public class MainMenu {
	Integer opt;
	Scanner sc = new Scanner(System.in);
	ProductController productController;

	// exibe menu
	public void mainMenu() {
		while (true) {
			System.out.print("##--------------MENU FOURSTORE--------------##\n");
			System.out.print("|--------------------------------------------|\n");
			System.out.print("| Op��o 1 - Cadastrar produto novo           |\n");
			System.out.print("| Op��o 2 - Registrar adi��o no estoque      |\n");
			System.out.print("| Op��o 3 - Listar todos os produtos         |\n");
			System.out.print("| Op��o 4 - Efetuar venda                    |\n");
			System.out.print("| Op��o 0 - Sair                             |\n");
			System.out.print("|--------------------------------------------|\n");
			System.out.print("|              Digite uma op��o:             |\n");
			System.out.print("|--------------------------------------------|\n");
			opt = sc.nextInt();

			switch (opt) {
			case 1:
				userCallCreate();
				break;
			case 2:
				userCallAdd();
				break;

			case 3:
				userCallListAll();
				break;

			case 4:
				userCallSell();
				break;

			case 0:
				System.out.println("Obrigado por utilizar nosso sistema!");
				System.exit(0);
				break;
			}

		}
	}

	public void userCallCreate() {
		sc.nextLine();

		String sku;
		Double price;
		Integer qtt;
		String type;
		String size;
		String color;
		String category;
		String department;

		System.out.println("Informe  a sku do produto:");
		sku = sc.nextLine();

		System.out.println("Informe  o pre�o do produto:");
		price = sc.nextDouble();

		System.out.println("Informe  a quantidade do produto:");
		qtt = sc.nextInt();

		System.out.println("Informe  o tipo do produto:");
		sc.nextLine();
		type = sc.nextLine();

		System.out.println("Informe  o tamanho do produto:");
		size = sc.nextLine();

		System.out.println("Informe  a cor do produto:");
		color = sc.nextLine();

		System.out.println("Informe  a categoria do produto:");
		category = sc.nextLine();

		System.out.println("Informe  o departamento do produto:");
		department = sc.nextLine();

		productController = new ProductController();
		System.out.println(productController.addProduct(sku, price, qtt, type, size, color, category, department));

	}

	public void userCallAdd() {
		System.out.println("Informe a SKU do produto:");
		sc.nextLine();
		String sku = sc.nextLine();

		System.out.println("Informe a quantidade a adicionar para o estoque:");
		Integer qtt = sc.nextInt();
		
		productController = new ProductController();
		System.out.println(productController.callAdd(sku, qtt));

	}

	public void userCallListAll() {
		productController = new ProductController();
		System.out.println(productController.callListAll());
	}

	public void userCallSell() {
		System.out.println("Informe a SKU do produto:");
		sc.nextLine();
		String sku = sc.nextLine();

		System.out.println("Informe a quantidade do produto:");
		//sc.nextLine();
		Integer qtt = sc.nextInt();

		productController = new ProductController();
		System.out.println(productController.callRemove(sku, qtt));

	}
}
