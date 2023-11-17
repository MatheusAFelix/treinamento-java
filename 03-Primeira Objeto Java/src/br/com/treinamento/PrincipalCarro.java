package br.com.treinamento;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.ano = 2014;
		carro1.cor = "Branco";
		carro1.marca = "Volkswagen";
		carro1.modelo = "Jetta";
		
		System.out.println("Modelo de carro:" +carro1.modelo);
		carro1.ligar();
		carro1.mostrarIdade();
		carro1.buzinar("BIII-BIII");
		carro1.desligar();

	}

}
