package br.com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maça");// Adiciona na odem que chega
		list.add(1, "Banana"); // Adiciona informando a posição
		list.addFirst("Goiaba"); // Adiciona no inicio da lista
		list.addLast("Uva");// Adiciona no 	final da lista
		
		System.out.println(list);

	}
}
