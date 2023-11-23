package br.com.treinamento;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome ("Matheus");
		cliente1.setCpf ("123456789");
		
		Conta conta1 = new Conta();
		conta1.setAgencia("772-2");
		conta1.setNumeroConta(315618);
		conta1.setSaldo(150.00);
		conta1.setTitular(cliente1);								
		//_______________________________________\\
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome ("Maria");
		cliente2.setCpf ("1526178289");
		
		
		Conta conta2 = new Conta();
		conta2.setAgencia("52617");
		conta2.setNumeroConta(315618);
		conta2.setSaldo(150.00);
		
		
		
		
		//_______EXECUÇÃO DO PROGRAMA_________\\
		
		System.out.println("Valor da conta1 antes do deposito: R$"+conta1.getSaldo());
		conta1.sacar(30.00);
		System.out.println("Saldo atual:  R$"+conta1.getSaldo());
		
		conta1.sacar(20.00);
		System.out.println("Saldo atual:  R$"+conta1.getSaldo());
		System.out.println("\n");
		
		
		//Execução de tranferência entre contas
		conta1.tranferir(conta2, 20);
		System.out.println("Saldo da conta 1: R$"+conta1.getSaldo());
		System.out.println("Saldo da conta 2: R$"+conta2.getSaldo());
		
		//Execução Conta e Cliente 
		System.out.println("Nome do cliente conta1 é: "+ conta1.getTitular().getNome());
	}

}
