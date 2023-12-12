package br.com.treinamento.caluculos;

/**
 * Essa classe é responsavel por fornecer diversas fórmulas de cálculos que
 * podem ser utilizadas em vários projetos.<br/>
 * <b>A classe não possui atributos e os métodos são todos estáticos</b> veja
 * mais informações em:
 * <a href="http://www.github.com/Matheus.A.F/treinamento">LINK!
 */

public class Calculos {

	/**
	 * Método para somar dois números distintos
	 * 
	 * @param Numero1 recebe o primeiro valor para o cálculo
	 * @param Numero2 recebe o segundo valor para o cálculo
	 * @return Resultado com a soma dos dois numeros
	 * @author Matheus
	 * @since V1
	 */

	public static Integer somarDoisNumeros(Integer numero1, Integer Numero2) {
		return numero1 + Numero2;
	}

	public static Double caluculaCircunferencia(Integer diametro) {

		Double pi = 3.14159265;
		return pi * diametro;
	}

	public static Integer calculaAreaQuadrado(Integer base, Integer altura) {
		return base * altura;
	}

}
