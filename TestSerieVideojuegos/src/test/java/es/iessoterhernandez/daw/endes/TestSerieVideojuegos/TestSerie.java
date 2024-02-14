package es.iessoterhernandez.daw.endes.TestSerieVideojuegos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;



import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Unit test for simple Serie.
 */
public class TestSerie 
{
	private Serie serie1,serie2;
    
	 @BeforeEach
		public  void inicio() {
			serie1 = new Serie("The office", 9, "comedia", "nisu");
			serie2 = new Serie("Los simpson", 20, "Dibus", "MATT");
		}

		@AfterEach
		public  void finish() {
			serie1 = null;
			serie2 = null;
		}
		
		//Test 
		
		@Test
		public void  comparaTestMayor() {
			//La serie actual tiene mas temporadas que la otra
			assertEquals(serie2.compareTo(serie1),Serie.MAYOR);
			//La serie actual tiene menos temporadas que la otra
			assertEquals(serie1.compareTo(serie2),Serie.MENOR);
			
		}
		
		@Test
		public void comparaTestIgual() {
			serie2.setnumeroTemporadas(9);
			assertEquals(serie1.compareTo(serie2),Serie.IGUAL);			
		}
		
		@Test
		public void comparaEquals() {
			//Compara titulo y creador para que sean iguales
			assertFalse(serie1.equals(serie2));
			serie2.setTitulo("The office");
			assertFalse(serie1.equals(serie2));
			serie2.setcreador("nisu");
			assertTrue(serie1.equals(serie2));		
			
		}
		
		@Test
		public void emtregadoTest() {
			serie1.entregar();
			assertTrue(serie1.isEntregado());
			serie1.devolver();
			assertFalse(serie1.isEntregado());
		}
		
		@Test
		public void toStringTest() {
			String cadena ="Informacion de la Serie: \n" +
	                "\tTitulo: "+serie1.getTitulo()+"\n" +
	                "\tNumero de temporadas: "+ serie1.getnumeroTemporadas()+"\n" +
	                "\tGenero: "+serie1.getGenero()+"\n" +
	                "\tCreador: "+serie1.getcreador();
			
			assertTrue(serie1.toString().equals(cadena));	
			
			
			
		}
    	 
    	 
    	
    	
    	
    	
    	
    
}
