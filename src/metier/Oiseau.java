package metier;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Oiseau extends Volatile {

	final static int VIE_MAX = 60;
	final static double SEUIL_POUSSIN = 5 * Math.pow(10, 9);
	final static double SEUIL_ADULTE = 20 * Math.pow(10, 9);
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
    int x = rand.nextInt(100);
    int y = 0;
    position = new Point(x,y);
    
        
    vitesse =0;
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
		etat=new Poussin(position,monUnivers);
		
	    
		
	}

	//Methode sexe oppose retourne vrai si les deux oiseaux sont de sexe opposé
	public boolean sexeOppose(Oiseau o){
	return (this.sonSexe != o.sonSexe) ;
	}
	

  public void seDeplacer(long tempsEnSeconde) {
    etat.seDeplacer(tempsEnSeconde);
    
  }

  public void setPosition(double i, double j) {
    this.etat.position.setLocation(i, j);
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
    etat = new Adulte(position,monUnivers);    
  }
  
  protected void calculerDureeDeVie(){
	  this.dureeDeVie = (Math.random() * (VIE_MAX-1)) + 1 * Math.pow(10, 9) ;
  }

  
  protected long calculerAge(){
	long difference = System.nanoTime() - this.dateNaissance;
	return difference;  
  }
  
  public void vieillir(){
	  if (this.calculerAge() >=  SEUIL_POUSSIN){
		  this.eclore();
	  }
	  if (this.calculerAge() >= SEUIL_ADULTE){
		  this.puberte();
	  }
	  if (this.calculerAge() >= this.dureeDeVie){
		  this.kill();
		  }  
	  }

  public Sex getSonSexe() {
	  return sonSexe;
  }

  public void setSonSexe(Sex sonSexe) {
	this.sonSexe = sonSexe;
  }

  public Volatile getEtat() {
	return etat;
  }

  public void setEtat(Volatile etat) {
	this.etat = etat;
  }
}
