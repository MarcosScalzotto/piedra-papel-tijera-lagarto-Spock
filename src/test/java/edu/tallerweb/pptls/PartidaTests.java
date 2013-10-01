package edu.tallerweb.pptls;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
		}
		
	/*@Test
		public void papelEnvuelvePiedra(){
		Mano jugadorUno= new Mano(Forma.PAPEL);
		Mano jugadorDos= new Mano(Forma.PIEDRA);

		assertEquals("Papel envuelve piedra",
				Resultado.GANA,jugadorUno.jugarCon(jugadorDos));
		}*/

	/*@Test
		public void spockEnvenenaSpock(){
		Mano jugadorUno= new Mano(Forma.PAPEL);
		Mano jugadorDos= new Mano(Forma.PAPEL);

		assertEquals("Spock envenena a Spock",
				Resultado.EMPATA,jugadorUno.jugarCon(jugadorDos));
		}*/

}
