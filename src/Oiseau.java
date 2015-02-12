public class Oiseau implements Volatile {

	final static int VIE_MAX = 120;
	private Volatile etat;
	int positionX;
	int positionY;
	Sex sonSexe;  // Enum

	@Override
	public void info() {
		// etat de l'oiseau
		System.out.println("je suis un " + this.etat);
	}

	public void eclore() {
		etat = new Poussin();
	}

	public Oiseau() {
		etat = new Oeuf();
	
	}
	// Methode sexe oppose retourne vrai si les deux oiseaux sont de sexe opposé
	public boolean sexeOppose(Oiseau o){
	return (this.sonSexe != o.sonSexe) ;
	}
	

}
