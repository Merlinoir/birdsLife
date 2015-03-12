package metier;

import java.awt.Point;
import java.util.Random;

public class Adulte extends Volatile {
	
	// Point de destination
	Point pointFinal;

	public Adulte(Point laOuLOiseauEtait, Univers lUnivertDeLOiseau) {
		position = laOuLOiseauEtait;
		vitesse = 2;
		monUnivers = lUnivertDeLOiseau;
		// Point de destination
		Random rand = new Random();
		int x = rand.nextInt(monUnivers.MAX_UNIVERS_ABSCISSE);
		int y = rand.nextInt(monUnivers.MAX_UNIVERS_ORDONNEES);
		pointFinal = new Point(x, y);
	}

	@Override
	public void info() {
		System.out.println("je suis un adulte");
	}

	
	public void seDeplacer(long tempsEnSeconde) {

		int distance = (int) (tempsEnSeconde * vitesse);

		// Calculer la distance entre position actuelle et finale
		double ecartX = Math.pow((this.pointFinal.x - this.position.x), 2);
		double ecartY = Math.pow((this.pointFinal.y - this.position.y), 2);
		double distanceTotale = Math.sqrt(ecartX + ecartY);

		if (distance > distanceTotale || distanceTotale == 0) {
			this.position.setLocation(this.pointFinal);
			Random rand = new Random();
			this.pointFinal = new Point(
					rand.nextInt(monUnivers.MAX_UNIVERS_ABSCISSE),
					rand.nextInt(monUnivers.MAX_UNIVERS_ORDONNEES));
		} else {
			// Calcul du ratio
			double ratio = (distance / distanceTotale);

			// Incrementation
			double incX = ratio * (this.pointFinal.x - this.position.x);
			double incY = ratio * (this.pointFinal.y - this.position.y);

			this.position.setLocation(incX, incY);
		}

	}

	public boolean reproduction(Oiseau o) {
		// On ignore si un oiseau est mort.

		return true;
	}

	public boolean distanceProche(Oiseau o) {

		return true;
	}

	public boolean familleDifferente(Oiseau o) {

		return true;
	}

}
