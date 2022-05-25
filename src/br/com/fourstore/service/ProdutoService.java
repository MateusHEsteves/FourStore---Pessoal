package br.com.fourstore.service;

import java.util.List;

import br.com.fourstore.data.ProdutoData;
import br.com.fourstore.model.Produto;

public class ProdutoService {
	
	ProdutoData db = new ProdutoData();
	
	public void create(Produto product) {
		db.save(product);
	}
	
	public List<Produto> readAll() {
		return db.findAll();
	}

	public Produto readBySku(Integer sku) {
		return db.findBySku(sku);		
	}
	
	public void update(Produto produto) {
	}
	
	public void delete(Produto produto) {
	}



}
