package edu.tallerweb.pptls;

/**
 * Las diferentes Formas que existen en el juego
 */
public enum Forma {

	PIEDRA(0), SPOCK(1), PAPEL(2), LAGARTO(3), TIJERA(4);

	private final Integer valor;
	
	Resultado[][] resultados = new Resultado[5][5];

	private Forma(final Integer valor) {
		this.valor = valor;
		
	resultados[0][0] = Resultado.EMPATA;
	resultados[1][1] = Resultado.EMPATA;
	resultados[2][2] = Resultado.EMPATA;
	resultados[3][3] = Resultado.EMPATA;
	resultados[4][4] = Resultado.EMPATA;
	
	resultados[0][1] = Resultado.PIERDE;
	resultados[0][2] = Resultado.PIERDE;
	resultados[0][3] = Resultado.GANA;
	resultados[0][4] = Resultado.GANA;
	
	resultados[1][0] = Resultado.GANA;
	resultados[1][2] = Resultado.PIERDE;
	resultados[1][3] = Resultado.PIERDE;
	resultados[1][4] = Resultado.GANA;
	
	resultados[2][0] = Resultado.GANA;
	resultados[2][1] = Resultado.GANA;
	resultados[2][3] = Resultado.PIERDE;
	resultados[2][4] = Resultado.PIERDE;
	
	resultados[3][0] = Resultado.PIERDE;
	resultados[3][1] = Resultado.GANA;
	resultados[3][2] = Resultado.GANA;
	resultados[3][4] = Resultado.PIERDE;
	
	resultados[4][0] = Resultado.PIERDE;
	resultados[4][1] = Resultado.PIERDE;
	resultados[4][2] = Resultado.GANA;
	resultados[4][3] = Resultado.GANA;
	
	}

	public Integer getValor() {
		return this.valor;
	}
	
	public Resultado jugar(Forma forma){
		return this.resultados[this.getValor()][forma.getValor()];
	}
	
}


