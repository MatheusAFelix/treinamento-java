package br.com.treinamento.interfase;

public class Carro implements Veiculo{

	@Override
	public void liga() {
		System.out.println("Ligou o Carro");
		
	}

	@Override
	public Integer velocidadeMaxima() {
		return 190;
	}

	@Override
	public void buzina() {
		System.out.println("biiiiii-biiiiiii");
		
	}

	@Override
	public Integer velocidadeMxima() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
