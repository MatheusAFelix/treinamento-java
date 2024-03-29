package br.com.treinamento;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Matheus";
		cliente1.cpf = "123456789";
		
		Conta conta1 = new Conta();
		conta1.agencia = "772-2";
		conta1.numeroConta = 315618;
		conta1.saldo = 150.00;
		conta1.titular = cliente1;		
		//_______________________________________\\
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Maria";
		cliente2.cpf = "1526178289";
		
		Conta conta2 = new Conta();
		conta2.agencia = "52617";
		conta2.numeroConta = 315618;
		conta2.saldo = 150.00;
		conta2.titular = cliente2;
		
		
		//_______EXECUÇÃO DO PROGRAMA_________\\
		
		System.out.println("Valor da conta1 antes do deposito: R$"+conta1.saldo);
		conta1.depositar(20.00);
		
		System.out.println("Saldo atual:  R$"+conta1.saldo);
		
		
		
		System.out.println("Valor da conta1 antes do saque: R$"+conta1.saldo);
		conta1.sacar(30.00);
		
		System.out.println("Saldo atual:  R$"+conta1.saldo);
		System.out.println("\n");
		
		
		//Execução de tranferência entre contas
		conta1.tranferir(conta2, 20);
		
		System.out.println("Saldo da conta 1: R$"+conta1.saldo);
		System.out.println("Saldo da conta 2: R$"+conta2.saldo);
		System.out.println("\n");
		
		//Execução Conta e Cliente 
		System.out.println("Nome do cliente conta1 é: "+ conta1.titular.nome);
		System.out.println("Nome do cliente conta 2 é: "+ conta2.titular.nome);
	}

}
