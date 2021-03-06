package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
private Forma forma;

	public Mano(final Forma forma) {

		this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		int fila;
		int columna;
		int leganaA[][] = {{3 , 4} , {4 , 0} , {0 , 1} , {1 , 2} , {2 , 3}};

			if (this.forma.getValor() == otra.forma.getValor()) {

					return Resultado.EMPATA;

			}	else {

						fila = this.forma.getValor();

						for (columna = 0; columna < 2; columna++) {

							if (leganaA[fila][columna] == otra.forma.getValor()) {

								return Resultado.GANA;
							}
						}

						return Resultado.PIERDE;
				}
	}
					
}


