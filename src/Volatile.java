import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public abstract class Volatile {

  double dureeDeVie;
  String sex;
  List<Volatile> listeParents;
  Point position;
  long dateNaissance;
  boolean estVivant;
  protected Univers monUnivers;
  long vitesse;
  protected Univers monUnivers;
  long age;
  boolean estVivant;


  // Getter Setter Parent :
  public List<Volatile> getListeParents() {
      return listeParents;
  }
  public void setListeParents(List<Volatile> listeParents) {
    this.listeParents = listeParents;
  }
  
	public void info(){
	}
 
  public void seDeplacer(long tempsEnSeconde){
    //quelle unité de temps choisir???
    
  }
  
	public Oiseau seReproduire(Oiseau autreParent){
	  return null ;
	}
 
  public Point getLocation(){
    return position;
  }

  public void getPosition(){
  }
  
  public void setPosition(double i, double j) {
        this.position.setLocation(i, j);
  }
	// Méthode retournant les ancetres d'un Oiseau avec en parametres son degré de parenté
	public ArrayList<Volatile> aPourAncetres(int niveau) {
		ArrayList<Volatile> listAncetres = new ArrayList<Volatile>() ;
		
		if (niveau==1) { 
			listAncetres.addAll(this.getListeParents());
			return listAncetres ;
		}
		else{
			for ( Volatile unParent : listeParents ){
				listAncetres.addAll( unParent.aPourAncetres(niveau-1));
			}
		}
		return listAncetres;
	}
	
	// Récupérer dans une liste tous les Ancetres d'un Volatile :
	
	public ArrayList<Volatile> tousLesAncetres() {
		// Initialise la liste a retourner :
		ArrayList<Volatile> listAncetres = new ArrayList<Volatile>() ;
		// Ajout des parents de la cible à la liste des ancetres.
		if (!listeParents.isEmpty()) {
			listAncetres.addAll(this.getListeParents());
		}
		// Boucle foreach sur la liste de ses parents pour appel recursif
		for ( Volatile unParent : listeParents ){
				unParent.tousLesAncetres();
		}
		return listAncetres;
	}
 
  
  public void kill(){
	  this.estVivant = false;
  }
  
//  public void setUnivers(Univers univers) {
//		  this.kill();
//		 
//  
//  }

  public void setUnivers(Univers univers) {
    monUnivers = univers;
    
  }

}
