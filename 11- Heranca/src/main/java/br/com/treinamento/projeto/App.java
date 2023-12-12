package br.com.treinamento.projeto;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.treinamento.projeto.model.Gerente;

public class App {
	public static void main(String[] args) {

		Formatter formatador = new CPFFormatter();
		String cpf = formatador.format("54318766409");
		System.out.println(cpf);
		
		Gerente gerente = new Gerente ("Matheus", 531311);
		gerente.setNome("Matheus");
		gerente.setRegistro(345218);
		gerente.setSalario(1000.00);
		
		System.out.println(gerente);
		

	}
}
