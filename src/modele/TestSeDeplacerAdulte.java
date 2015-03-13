package modele;

import static org.junit.Assert.assertTrue;

import java.awt.Point;

import org.junit.Test;

import controle.Univers;
/*
public class TestSeDeplacerAdulte {

	private Oiseau initialiseOiseauAdulte() {
		// creer un univers
		Univers monUnivers = new Univers();
		
		Oiseau cuicui4 = new Oiseau(monUnivers);
		monUnivers.addVolatile(cuicui4);
		cuicui4.setPosition(16.0, 28.0);
		cuicui4.etat = new Adulte(cuicui4.position, monUnivers);
		return cuicui4;
	}

	@Test
	// Test pour un déplacement d'une seconde
	public void testSeDeplacerAdulteUneSeconde() {
		Oiseau cuicui4 = initialiseOiseauAdulte();
		// cuicui4.setPosition(16.0, 28.0);
	
		// Imposer le point final
		cuicui4.getEtat().position = new Point(20, 30);
		cuicui4.getEtat().pointFinal = new Point(20, 32);
		cuicui4.getEtat().vitesse = 2;

		// je fais se déplacer l'oiseau d'une seconde
		long tempsTest = 1;
    System.out.println(cuicui4.getPosition());
    System.out.println("Test Adulte : " + cuicui4.getEtat().pointFinal);
		cuicui4.seDeplacer(tempsTest);
		System.out.println("apres");

		System.out.println(cuicui4.getPosition());
		

		// Verifier si l'oiseau est là où il devrait etre
		assertTrue(cuicui4.getPosition().equals(cuicui4.getEtat().pointFinal));

	}
}*/


public class TestSeDeplacerAdulte {

  private Oiseau initialiseOiseauAdulte() {
    // creer un univers
    Univers monUnivers = new Univers();
    
    Oiseau cuicui4 = new Oiseau(monUnivers);
    monUnivers.addVolatile(cuicui4);
    Point positionDepart = new Point (16, 28);
    cuicui4.etat = new Adulte(positionDepart, monUnivers);
    return cuicui4;
  }

  @Test
  // Test pour un déplacement d'une seconde
  public void testSeDeplacerAdulteUneSeconde() {
    
    Oiseau cuicui4 = initialiseOiseauAdulte();
    cuicui4.setPosition(16.0, 28.0);
    System.out.println("Point initial : " + cuicui4.getEtat().position);

    // Fixer un point de destination
    //Point destination = new Point(20, 32);
    //Point destination = new Point(100, 100);
    Point destination = new Point(0, 0);
    cuicui4.getEtat().pointFinal = destination;
    System.out.println("Point final : " + cuicui4.getEtat().pointFinal);

    // Deplacer l'oiseau d'une seconde
    long tempsTest = 16;
    
    cuicui4.getEtat().seDeplacer(tempsTest);
    System.out.println("Nouvelle position : " + cuicui4.getEtat().position);
    
    // Verifier si l'oiseau est là où il devrait etre
    assertTrue(cuicui4.getPosition().equals(destination));

  }
}
