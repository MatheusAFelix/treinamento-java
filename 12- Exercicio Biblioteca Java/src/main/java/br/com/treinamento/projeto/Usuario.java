package br.com.treinamento.projeto;

import java.util.Scanner;

public class Usuario {
	
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu email: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite sua telefone: ");
		int idade = scanner.nextInt();
		
		System.out.println("Nome: " + nome + ", Idade: " + idade);
		
		scanner.close();
		
		}

}
