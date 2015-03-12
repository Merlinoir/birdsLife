package modele;

import static org.junit.Assert.assertTrue;

import java.awt.Point;

import org.junit.Test;

import controle.Univers;

public class TestSeDeplacerAdulte {

	private Oiseau initialiseOiseauAdulte() {
		// creer un univers
		Univers monUnivers = new Univers();
		Oiseau cuicui4 = new Oiseau();
		monUnivers.addVolatile(cuicui4);
		cuicui4.etat = new Adulte(position, monUnivers);
		return cuicui4;
	}

	@Test
	// Test pour un déplacement d'une seconde
	public void testSeDeplacerAdulteUneSeconde() {
		Oiseau cuicui4 = initialiseOiseauAdulte();
		cuicui4.setPosition(16.0, 28.0);
		System.out.println(cuicui4.position);

		// Imposer le point final
		cuicui4.getEtat().pointFinal = new Point(20, 32);

		// je fais se déplacer l'oiseau d'une seconde
		long tempsTest = 8;
		cuicui4.seDeplacer(tempsTest);
		System.out.println("Test Adulte : " + cuicui4.getEtat().pointFinal);

		// Verifier si l'oiseau est là où il devrait etre
		assertTrue(cuicui4.getLocation().equals(cuicui4.getEtat().pointFinal));

	}
}
