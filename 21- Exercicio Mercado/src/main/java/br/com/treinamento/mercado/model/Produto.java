package br.com.treinamento.mercado.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Produto {
	
	public Produto(String nome, BigDecimal preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	@Getter @Setter
	private String nome;

	@Getter @Setter
	private BigDecimal preco;
	
	
}
