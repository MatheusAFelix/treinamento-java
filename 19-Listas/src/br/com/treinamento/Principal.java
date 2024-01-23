package br.com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		//Array list de inteiros 
		ArrayList<Integer> list0 = new ArrayList<>();
		
		//Faz o uso de polimorfismo
		List list = new ArrayList<Integer>();
		
		//Variavel local com palavra-classe "var"
		var list2 = new ArrayList<Integer>();
	
		System.out.println("lista0: "+list0.getClass());
		System.out.println("lista0: "+list.getClass());
		System.out.println("lista0: "+list2.getClass());
		
		
		}

}
