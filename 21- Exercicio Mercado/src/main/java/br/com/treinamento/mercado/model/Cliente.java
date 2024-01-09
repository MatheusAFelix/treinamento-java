package br.com.treinamento.mercado.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Cliente {
	
	public Cliente(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
		
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String email;
	
	@Getter @Setter
	private String cpf;

	}
