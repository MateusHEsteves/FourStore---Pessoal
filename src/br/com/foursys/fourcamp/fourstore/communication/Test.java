package br.com.foursys.fourcamp.fourstore.communication;
import br.com.foursys.fourcamp.fourstore.model.Produto;
import br.com.foursys.fourcamp.fourstore.controller.ProductController;


public class Test {

	public static void main(String[] args) {
		Produto ps4 = new Produto("Playstation 5", 2500.99, "Videogame", "�nico", "Preto", "Games", "Eletr�nicos");
		Produto NintendoSwitch = new Produto("Nintendo Switch", 1999.99, "Videogame", "�nico", "Branco", "Games", "Eletr�nicos");
		Produto Jaspion = new Produto("Boneco do Jaspion", 89.00, "Bonecos & Action Figures", "Pequeno", "Outros", "Bonecos de S�ries e Televis�o", "Brinquedos");
		
		System.out.println(ps4);
		System.out.println("\n-------------------------- // --------------------------\n");
		System.out.println(NintendoSwitch);
		System.out.println("\n-------------------------- // --------------------------\n");
		System.out.println(Jaspion);
	}
}
