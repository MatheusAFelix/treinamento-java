package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa ();
		pessoa.nome = "Matheus Augusto Felix";
		pessoa.idade = 39;
		pessoa.altura = 1.73;
		pessoa.peso = 75.00;
		
		Pessoa pessoa2 = new Pessoa();
		System.out.println(pessoa2.nome);
		
		pessoa2.nome = "Moisés da Silva";
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa2.nome);
		
	}
	
	
	
	
	

}
