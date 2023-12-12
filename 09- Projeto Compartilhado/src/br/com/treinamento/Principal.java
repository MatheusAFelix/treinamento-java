package br.com.treinamento;

import br.com.treinamento.caluculos.Calculos;

public class Principal {

	public static void main(String[] args) {

		Integer distancia = Calculos.somarDoisNumeros(5, 10);

		System.out.println("A Distancia da Casa ao Boteco é: " + distancia + " Metros!");

	}

}
