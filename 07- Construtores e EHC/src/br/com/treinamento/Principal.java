package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoaA = new Pessoa();
		pessoaA.setNome("Matheus");
		pessoaA.setIdade(20);
		
		Pessoa pessoaB = new Pessoa();
		pessoaB.setNome("Matheus");
		pessoaB.setIdade(20);
		
		System.out.println("Pessoa A é igual e Pessoa B?"+ (pessoaA == pessoaB)); // False
		System.out.println("Pessoa A é igual e Pessoa B?"+ pessoaA.equals(pessoaB)); // True
		System.out.println("Hash pessoa A: "+ pessoaA.hashCode()); // 1961199145
		System.out.println("Hash pessoa B: "+ pessoaB.hashCode()); // 1961199145
		
		
	}

}
