package br.com.treinamento;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int[] arrayList = {10, 20, 30, 40, 70, 90};
		
		int contador = 0;
		System.out.print("Lista de numeros");
		for (int array : arrayList) {
			System.out.println(array);
			contador ++;
		}
		
		System.out.println("Quantidade de regitros" + contador);

	}

}
