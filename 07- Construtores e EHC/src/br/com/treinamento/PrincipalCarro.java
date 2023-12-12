package br.com.treinamento;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro ("VW", "Jetta", 2015);
		System.out.println("Nome do carro: " + carro.getNome());
		
		Carro carro2 = new Carro(2008);
		System.out.println("Idade do carro: "+carro2.idadeCarro());

	}

}
