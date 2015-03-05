import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public abstract class Volatile {


final static int VIE_MAX = 120;
  String sex;
  List<Volatile> listeParents;
  Point position;
  
  // Getter Setter Parent :
	public List<Volatile> getListeParents() {
			return listeParents;
	}
	public void setListeParents(List<Volatile> listeParents) {
		this.listeParents = listeParents;
	}
  
  public void info(){
  }
 
  public void seDeplacer(){
  }
  
  public Oiseau seReproduire(Oiseau autreParent){
	  return null ;
  }
 
	public ArrayList<Volatile> aPourAncetres(int niveauParente) {
		// retourne une liste d'ancetres avec en paramètres le degré de parenté
		return null;
	}
  
  
  public void getPosition(){
  }
  
  
  
 
}
