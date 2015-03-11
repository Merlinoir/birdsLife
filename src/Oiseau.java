import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
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
	public Oiseau(List<Volatile> parents) {
	    etat = new Oeuf();
	    Point p = new Point((int) Math.random(),0);
	    listeParents = parents;
	}
	
	
	// Changement d'etat :
	
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

  public Oiseau seReproduire(Oiseau autreparent) {
    etat.seReproduire(null);
    return null ;
  }

	public ArrayList<Volatile> aPourAncetres(int niveauParente) {
		// retourne une liste d'ancetres avec en paramètres le degré de parenté
		return null;
	}
  
  public void puberte() {
    etat = new Adulte();
    
  }
  
  protected void calculerDureeDeVie(){
	  this.dureeDeVie = (long) Math.random(); 
  }

  
}
