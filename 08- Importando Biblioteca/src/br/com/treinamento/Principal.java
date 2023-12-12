package br.com.treinamento;

public class Principal {
	
	public static void main (String[] args) {
		
		Carro carro = new Carro();
		carro.setModelo("Jetta");
		carro.setAnoFabricação(2015);
		carro.setMotor("2.0");
		
		System.out.println(carro);
	}
	
}