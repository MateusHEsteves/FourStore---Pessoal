package br.com.foursys.fourcamp.fourstore;

import br.com.foursys.fourcamp.fourstore.communication.MainMenu;
import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;

public class Principal {
	

	public static void main(String[] args) {

			
//			MainMenu menu = new MainMenu();
//			menu.mainMenu();
// Atualizar métodos.
		
		PaymentMethod method = null;
		method = PaymentMethod.DEBIT;
		
		System.out.println(method.getCode());
		
		
	}

}
