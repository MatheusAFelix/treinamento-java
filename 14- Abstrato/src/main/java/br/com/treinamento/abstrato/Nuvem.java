package br.com.treinamento.abstrato;

import lombok.Getter;
import lombok.Setter;

public abstract class Nuvem {
	
	@Getter @Setter
	private String nomeImagem;
	
	private String urlImagem;
	
	abstract String convertBase64(String imagem);
	
	public void upload(String base64) {
		System.out.println("Imagem enviada com sucesso!");
		this.setUrlImagem("http://caminho_da_imagem");
		
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
}
