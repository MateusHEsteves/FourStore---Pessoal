package br.com.fourstore.model;

public class Produto {
	
	Integer sku;
	String name;
	Double preco;
	String tamanho;
	String cor;
	Integer quantidade;
	String tipo;
	String descricao;
	String categoria;
	String departamento;
	
	
	/**
	 * 
	 * @param sku é o stock keeping unit que recebe o valor imputado pelo usuário para verificar no estoque 
	 * @param name recebe o nome do produto imputado pelo usuario
	 * @param preco o valor produto que será imputado no estoque
	 * @param tamanho o tamanho do produto que será imputado no estoque
	 * @param cor imputa a caro do produto a ser imputado no estoque
	 * @param quantidade o tanto de produtos a ser imputado no estoque
	 * @param tipo qual o produto a ser imputado no estoque
	 * @param descricao do produto a ser imputado no estoque
	 * @param categoria do produto a ser imputado no estoque
	 * @param departamento do produto a ser imputado no estoque
	 */
	public Produto(Integer sku, String name, Double preco, String tamanho, String cor, Integer quantidade, String tipo,
			String descricao, String categoria, String departamento) {
		this.sku = sku;
		this.name = name;
		this.preco = preco;
		this.tamanho = tamanho;
		this.cor = cor;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [sku=" + sku + ", name=" + name + ", preco=" + preco + ", tamanho=" + tamanho + ", cor=" + cor
				+ ", quantidade=" + quantidade + ", tipo=" + tipo + ", descricao=" + descricao + ", categoria="
				+ categoria + ", departamento=" + departamento + "]";
	}
	

}
