package br.com.treinamento;

public class Conta {
	
	//Atributos
	private String setAgencia;
	private int numeroConta;
	private double saldo;
	private Cliente titular;
	
	// Getters e Setters
	public String getAgencia() {
		return setAgencia;
	}

	public void setAgencia(String agencia) {
		this.setAgencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

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
