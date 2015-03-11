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

  
    calculerDureeDeVie();
    estVivant = true;
    dateNaissance = System.nanoTime();

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

	//Methode sexe oppose retourne vrai si les deux oiseaux sont de sexe opposé
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
  
  protected void calculerDureeDeVie(){
	  this.dureeDeVie = Math.pow((Math.random() * (60-1)) + 1, 9) ;
  }
  
  protected long calculerAge(){
	long difference = System.nanoTime() - this.dateNaissance;
	return difference;  
  }
  
  public void vieillir(){
	  if (this.calculerAge() >=  Math.pow(5, 9)){
		  this.eclore();
	  }
	  if (this.calculerAge() >= Math.pow(20, 9)){
		  this.puberte();
	  }
	  if (this.calculerAge() >= this.dureeDeVie){
		  this.kill();
		  }  
	  }
}
