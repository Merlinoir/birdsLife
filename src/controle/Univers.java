package controle;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import modele.Oiseau;
import modele.Volatile;

public class Univers {
	private static final int NB_DEBUT = 10;
	public final int MIN_UNIVERS_ABSCISSE = 0;
	public final int MIN_UNIVERS_ORDONNEES = 0;
	public final int MAX_UNIVERS_ABSCISSE = 400;
	public final int MAX_UNIVERS_ORDONNEES = 400;
	List<Oiseau> laColonie = new ArrayList<Oiseau>();

	public Univers() {
		for (int i = 0; i < NB_DEBUT; i++) {
			// l'oiseau fait les liens tout seul
			 new Oiseau(this);
			//laColonie.add(new Oiseau(this));
		}
	}

	public void passerTemps(double temps) {
		;
		List<Oiseau> oeuf = new ArrayList<Oiseau>();
		for (int i = 0 ; i < laColonie.size() ; i++) {
			
			Volatile unOiseau =  laColonie.get(i);

			unOiseau.vieillir();

			//if (laColonie.get(i).isEstVivant()) {
				laColonie.get(i).seDeplacer(temps);
			//}

			for (int j = i + 1; j < laColonie.size(); j++) {
				Oiseau partenaire = laColonie.get(j);
				if (laColonie.get(i).reproductionPossible(partenaire)) {
					oeuf.add(laColonie.get(i).seReproduire(partenaire));
					break;
				}

			}
			i++;
		}
		laColonie.addAll(oeuf);
	}

	public List<Point> getAllPoint() {
		List<Point> lesPositions = new ArrayList<Point>();
		for (Volatile unOiseau : laColonie) {
			lesPositions.add(unOiseau.getPosition());
		}
		return lesPositions;

	}

	public void addVolatile(Oiseau vola) {
		laColonie.add(vola);
		// vola.setUnivers(this);
	}

}
