import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

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
  }
	public Oiseau(List<Volatile> parents) {
	    etat = new Oeuf();
	    Point p = new Point((int) Math.random(),0);
	    listeParents = parents;
	}
	
	
	// Changement d'etat :
	
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
  
}
