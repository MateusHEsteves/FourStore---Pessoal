package br.com.fourstore.communication;

import br.com.fourstore.controller.MenuController;

public class MenuCommunication {
	
	public static void main(String[] args) {
		new MenuController((args.length > 0) ? "1" : "2");
	}
}
