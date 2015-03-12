package modele;

import java.awt.Point;

import controle.Univers;

public class Adulte extends Volatile {

	private boolean droite = true;
	private boolean haut = true;

	public Adulte(Point laOuLOiseauEtait, Univers lUnivertDeLOiseau) {
		position = laOuLOiseauEtait;
		vitesse = 2;
		monUnivers = lUnivertDeLOiseau;
	}

	@Override
	public void info() {
		System.out.println("je suis un adulte");
	}

	public void seDeplacer(long tempsEnSeconde) {

		int distance = (int) (tempsEnSeconde * vitesse);

		if (droite) {
			this.position.setLocation((this.position.x + distance), 0.d);

			if (this.position.x > monUnivers.MAX_UNIVERS_ABSCISSE) {
				this.position.x = monUnivers.MAX_UNIVERS_ABSCISSE;
				droite = false;
			}

			// on va a gauche
		} else {
			this.position.setLocation((this.position.x - distance), 0.d);
			if (this.position.x < monUnivers.MIN_UNIVERS_ABSCISSE) {
				this.position.x = monUnivers.MIN_UNIVERS_ABSCISSE;
				droite = true;
			}
		}

		if (haut) {
			this.position.setLocation(this.position.x,
					(this.position.y + distance));

			if (this.position.y > monUnivers.MAX_UNIVERS_ORDONNEES) {
				this.position.y = monUnivers.MAX_UNIVERS_ORDONNEES;
				haut = false;
			}

			// on va en bas
		} else {
			this.position.setLocation((this.position.x - distance), 0.d);
			if (this.position.y < monUnivers.MIN_UNIVERS_ORDONNEES) {
				this.position.y = monUnivers.MAX_UNIVERS_ORDONNEES;
				haut = true;
			}
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
