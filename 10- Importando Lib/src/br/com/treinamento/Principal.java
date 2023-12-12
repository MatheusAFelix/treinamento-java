package br.com.treinamento;

import br.com.treinamento.caluculos.Calculos;

public class Principal {
	
	public static void main(String[] args) {
		
		Integer soma = Calculos.somarDoisNumeros(5, 20);
				
		System.out.println("O resultado é: "+soma);
		
	}

}
