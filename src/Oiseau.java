import java.awt.Point;

public class Oiseau extends Volatile {
  
  Volatile etat;
  
	public void info() {
		// methode de test pour avoir l'état de l'oiseau
		System.out.println("je suis un " + this.etat);
	}
	
	//constructeur
	public Oiseau() {
    etat = new Oeuf();
    Point p = new Point((int) Math.random(),0);
  }
	
	public void eclore() {
		etat=new Poussin();
		
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
  
}
