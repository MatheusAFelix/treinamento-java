package br.com.treinamento.mercado.model;


import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ItemPedido {

	public ItemPedido(BigDecimal quantidade, BigDecimal valorUnitario, BigDecimal valorTotal) {
		super();
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
	}
		@Getter @Setter
		private BigDecimal quantidade;
		
		@Getter @Setter
		private BigDecimal valorUnitario;
		
		@Getter @Setter
		private BigDecimal valorTotal;
}
	
	
