public class Oiseau implements Volatile {

	final static int VIE_MAX = 120;
	Volatile etat;
	int positionX;
	int positionY;
	String sex;
	Oiseau parent1;
	Oiseau parent2;
	

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
