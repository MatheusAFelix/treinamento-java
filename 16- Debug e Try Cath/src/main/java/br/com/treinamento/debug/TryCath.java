package br.com.treinamento.debug;

public class TryCath {

	public static void main(String[] args) {
		
		String frase = "Óla, sou a frase 1";
		String novaFrase = "Óla, sou a frase 2";
		
		try {
			
			frase = frase.toUpperCase();
			novaFrase = novaFrase.toLowerCase();
			
			System.out.println("Frase:" +frase);
			System.out.println("Nova Frase:" +novaFrase);
			
		} catch (Exception e) {
			
			System.out.println("Não foi possivel converter as frases");
			System.out.println("Motivo:"+e);
			
		} finally {
			System.out.println("Sempre executa esse bloco");
		}
			
	}

}
