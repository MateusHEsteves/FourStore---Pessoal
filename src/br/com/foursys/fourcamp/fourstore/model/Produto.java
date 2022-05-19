package br.com.foursys.fourcamp.fourstore.model;

import br.com.foursys.fourcamp.fourstore.helper.Utils;

public class Produto {
	private static int contador = 1;
	
	private int codigo;
	private String nome;
	private Double preco;
	private String tipo; //exigido pelo MVP
	private String tamanho; //exigido pelo MVP
	private String cor; //exigido pelo MVP
	private String categoria; //exigido pelo MVP
	private String departamento; //exigido pelo MVP
	
	
	// Construtores (código foi diferente, para acompanhar o contador)
	public Produto(String nome, Double preco, String tipo, String tamanho, String cor, String categoria,
			String departamento) {
		//super();
		this.codigo = Produto.contador;
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.cor = cor;
		this.categoria = categoria;
		this.departamento = departamento;
		Produto.contador += 1;
	}
	
	// Getters and Setters (código foi diferente, para acompanhar o contador)
	public int getCodigo() {
		return this.codigo;
	}
		
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	//gerador do retorno lá no programa, de como aparecerá o Produto.
	public String toString() {
		return "Código: " + this.getCodigo()
				+ "\nNome: " + this.getNome()
				+ "\nPreço: " + Utils.doubleParaString(this.getPreco())
				+ "\nTipo: " + this.getTipo()
				+ "\nTamanho: " + this.getTamanho()
				+ "\nCor: " + this.getCor()
				+ "\nCategoria: " + this.getCategoria()
				+ "\nDepartamento: " + this.getDepartamento();
	}

}
