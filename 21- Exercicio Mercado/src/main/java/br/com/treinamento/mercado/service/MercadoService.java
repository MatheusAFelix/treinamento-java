package br.com.treinamento.mercado.service;

import java.math.BigDecimal;

import br.com.treinamento.mercado.main.Principal;
import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.Produto;

public class MercadoService {

	public static void montarMenu() {
		System.out.println("Sistema de vendas - Selecione uma opção:");
		System.out.println("1- Cadastrar Cliente");
		System.out.println("2- Listagem de Clientes");
		System.out.println("3- Adicionar Produto");
		System.out.println("4- Listagem de Produtos");
		System.out.println("5- Sair");
	}

	public static void cadastrarCliente() {
		System.out.println("Cadastro de CLientes");
		System.out.println("----------------------------------");
		
		System.out.print("codigoUnico:");
		@SuppressWarnings("unused")
		String codigoUnico = Principal.scanner.nextLine();
		
		System.out.print("Nome:");
		String nome = Principal.scanner.nextLine();

		System.out.print("E-mail:");
		String email = Principal.scanner.nextLine();

		Principal.clienteList.add(new Cliente(nome, email, email));
	}
	
	public static void cadastrarProdutos() {
		System.out.println("Cadastro de CLientes");
		System.out.println("----------------------------------");

		System.out.print("Nome:");
		String nome = Principal.scanner.nextLine();

		System.out.print("Preço:");
		String precoString = Principal.scanner.nextLine();
		BigDecimal preco = new BigDecimal(precoString);
		Principal.produtoList.add(new Produto(nome, preco));
	}

	public static void ListarCliente() {
		System.out.println("Listagem de Clientes");
		System.out.println("----------------------------------");
		System.out.println("Nome \t\t E-mail");
		System.out.println("----------------------------------");
		Principal.clienteList.forEach(c -> System.out.println(c.getNome() + " \t\t" + c.getEmail()));
		System.out.println("----------------------------------");
	}

		}