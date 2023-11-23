package br.com.treinamento;

public class Cliente {
	
	//Atalho para gerar Get Set: CTRL + 3 --> Escreva GGAS
	
	//Atributos
	private String nome;
	private String cpf;
	private String senha;
	
	// Getters e Setters (Métodos de acessos)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}