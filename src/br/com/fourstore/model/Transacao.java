package br.com.fourstore.model;

import java.time.LocalDate;

import br.com.fourstore.enums.MetodoDePagamento;

public class Transacao {
	
	Long id;
	
	MetodoDePagamento metodoDePagamento;
	
	LocalDate dataDeTransacao;
	
	Produto produto;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MetodoDePagamento getMetodoDePagamento() {
		return metodoDePagamento;
	}
	public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
	public LocalDate getDataDeTransacao() {
		return dataDeTransacao;
	}
	public void setDataDeTransacao(LocalDate dataDeTransacao) {
		this.dataDeTransacao = dataDeTransacao;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

}
