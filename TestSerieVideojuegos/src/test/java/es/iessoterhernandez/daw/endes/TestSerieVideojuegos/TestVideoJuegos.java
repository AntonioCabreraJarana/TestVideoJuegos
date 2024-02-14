package es.iessoterhernandez.daw.endes.TestSerieVideojuegos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for VideoJuegos .
 */
public class TestVideoJuegos {

	private Videojuego video1, video2;

	@BeforeEach
	public void inicio() {
		video1 = new Videojuego("GODOWA", 10, "accion", "peruvian GAME");
		video2 = new Videojuego("Rederetion", 500, "Tiros", "Estrella de rock");
	}

	@AfterEach
	public void finish() {
		video1 = null;
		video2 = null;
	}

	// Test

	@Test
	public void testEntregar() {

		video1.entregar();
		assertTrue(video1.isEntregado());
	}

	@Test
	public void testDevolver() {

		video1.devolver();
		assertFalse(video1.isEntregado());
	}

	@Test
	public void testCompareTo() {

		assertEquals(-1, video1.compareTo(video2));
		assertEquals(1, video2.compareTo(video1));
		video1.setHorasEstimadas(500);
		assertEquals(0, video1.compareTo(video1));
	}

	@Test
	public void testEquals() {
		Videojuego video3 = new Videojuego();
		video3 = video1;
		assertTrue(video1.equals(video3));
		assertFalse(video1.equals(video2));
	}

}
