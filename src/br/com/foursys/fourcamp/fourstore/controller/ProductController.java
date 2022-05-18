package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductController {

	
	
	public String cadProduct(String sku, String description, Integer qtt, Double originPrice, Double salePrice) {
	
		String retorno ="";
		Product product = new Product(sku, qtt, originPrice, salePrice, description);
		if(product == null) {
			retorno ="Não foi possivel criar este produto";
			
		} else {
			retorno ="Cadastro realizado com sucesso."
					+ "\n Produto SKU: "+product.getSku()
					+ "\n Departamento: "+product.getDepartament()
					+ "\n Categoria: "+product.getCategory()
					+ "\n Tipo: "+product.getType()
					+ "\n Cor: "+product.getColor();
		}
		return retorno;
		
	}

	
}
