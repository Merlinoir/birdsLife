import java.awt.Point;
import java.util.Random;

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

    Random rand = new Random();
    int x= rand.nextInt(100);
    int y = 0;
    position = new Point(x,y);
    vitesse =0;

  
    calculerDureeDeVie();
    estVivant = true;
    age = System.nanoTime();

  }
	
	public void eclore() {
		etat=new Poussin();
		vitesse = 1; //1 unité par seconde
	}

	//Methode sexe oppose retourne vrai si les deux oiseaux sont de sexe opposé
	public boolean sexeOppose(Oiseau o){
	return (this.sonSexe != o.sonSexe) ;
	}
	
  public void seDeplacer(long temps) {
    etat.seDeplacer(temps);
    
  }

  public void seReproduire() {
    etat.seReproduire();
    
  }

  
  public void puberte() {
    etat = new Adulte();
    
  }
  
  protected void calculerDureeDeVie(){
	  this.dureeDeVie = (long) Math.random(); 
  }

  
}
