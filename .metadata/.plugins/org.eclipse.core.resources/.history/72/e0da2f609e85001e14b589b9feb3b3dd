package br.com.treinamento;

public class Conta {
	
	//Atributos
	String agencia;
	int numeroConta;
	double saldo;
	Cliente titular;
	
	//Métodos
	void tranferir (Conta contaDestino, double valor) {
		if(saldo<valor) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo = saldo - valor;
			contaDestino.saldo = contaDestino.saldo + valor;
		}
		
	}
	
	void sacar (double valor) {
		saldo = saldo-valor;
		
		System.out.println("Saque de: R$" +valor);
		
		
	}
	
	void depositar(double valor) {
		saldo = saldo+valor;
		
		System.out.println("Depósito de: R$" +valor);
		
	}

}
