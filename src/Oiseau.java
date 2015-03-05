import java.awt.Point;

public class Oiseau extends Volatile {

	final static int VIE_MAX = 120;
	Sex sonSexe;  // Enum
	Volatile etat;
  
	public void info() {
		// Etat de l'oiseau 
		System.out.println("je suis un " + this.etat);
	}
	
	//constructeur
	public Oiseau() {
    etat = new Oeuf();
    Point p = new Point((int) Math.random(),0);
    calculerDur�eDeVie();
    estVivant = true;
    age = System.nanoTime();
  }
	
	public void eclore() {
		etat=new Poussin();
		
	}

	// Methode sexe oppose retourne vrai si les deux oiseaux sont de sexe opposé
	public boolean sexeOppose(Oiseau o){
	return (this.sonSexe != o.sonSexe) ;
	}
	
  public void seDeplacer() {
    etat.seDeplacer();
    
  }

  public void seReproduire() {
    etat.seReproduire();
    
  }

  
  public void puberte() {
    etat = new Adulte();
    
  }
  
  protected void calculerDur�eDeVie(){
	  dur�eDeVie = (long) Math.random(); 
  }
  
}
