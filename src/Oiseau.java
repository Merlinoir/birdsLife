public class Oiseau implements Volatile {

	final static int VIE_MAX = 120;
	Volatile etat;
	int positionX;
	int positionY;
<<<<<<< HEAD
	Sex sonSexe;  // Enum
=======
	String sex;
	Oiseau parent1;
	Oiseau parent2;
	
>>>>>>> ee10e68f95f95b67df5fabd55ce05cea2aaa6c76

	public void info() {
		// Etat de l'oiseau 
		System.out.println("je suis un " + this.etat);
	}

	public void eclore() {
		etat=new Poussin();
	}

	public Oiseau() {
		etat = new Oeuf();
	
	}
	// Methode sexe oppose retourne vrai si les deux oiseaux sont de sexe opposé
	public boolean sexeOppose(Oiseau o){
	return (this.sonSexe != o.sonSexe) ;
	}
	

  public void seDeplacer() {
    // TODO Auto-generated method stub
    
  }

  public void seReproduire() {
    // TODO Auto-generated method stub
    
  }

  public void mourir() {
    // TODO Auto-generated method stub
    
  }
 
  public void puberte() {
    etat = new Adulte();
    
  }

}
