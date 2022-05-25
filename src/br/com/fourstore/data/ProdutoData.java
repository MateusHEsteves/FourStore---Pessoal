package br.com.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fourstore.model.Produto;

public class ProdutoData {

	List<Produto> estoqueDeProdutos = new ArrayList<>();

	public void save(Produto produto) {
		estoqueDeProdutos.add(produto);
	}

	public List<Produto> findAll() {
		return estoqueDeProdutos;
	}

	public Produto findBySku(Integer sku) {
		for (Produto produto : estoqueDeProdutos) {
			if (produto.getSku() == sku) {
				return produto;
			}
		}
		return null;
	}

	public int getIndexOfProduto(Produto produto) {
		return estoqueDeProdutos.indexOf(produto);
	}

	public void update(Produto produto) {
		delete(produto);
		save(produto);
	}

	public void delete(Produto produto) {
		estoqueDeProdutos.remove(getIndexOfProduto(produto));
	}

	public void deleteBySku(Integer sku) {
		estoqueDeProdutos.remove(getProdutoBySku(sku));
	}

	private Produto getProdutoBySku(Integer sku) {
		for (Produto produto : estoqueDeProdutos) {
			if (produto.getSku() == sku) {
				return produto;
			}
		}
		return null;
	}
}
