package controle;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import modele.*;

public class Univers {
  public final int MIN_UNIVERS_ABSCISSE = 0;
  public final int MIN_UNIVERS_ORDONNEES = 0;
  public final int MAX_UNIVERS_ABSCISSE = 100;
  public final int MAX_UNIVERS_ORDONNEES = 100;
  List<Volatile> laColonie = new ArrayList<Volatile> ();
  
	public Univers() {
	}

	public void addVolatile(Volatile oiseau) {
		laColonie.add(oiseau);
		oiseau.setUnivers(this);
	}
	
	public void passerTemps(){
		oiseau.vieillir();
		oiseau.seDeplacer();
		oiseau.seReproduire();
	}

	public static void main(String args[] ) {
		Univers univers = new Univers();		
		Oiseau oiseau1 = new Oiseau();
		Oiseau oiseau2 = new Oiseau();
		Oiseau oiseau3 = new Oiseau();
		Oiseau oiseau4 = new Oiseau();
		Oiseau oiseau5 = new Oiseau();
		univers.addVolatile(oiseau1);
		univers.addVolatile(oiseau2);
		univers.addVolatile(oiseau3);
		univers.addVolatile(oiseau3);
		univers.addVolatile(oiseau3);
		while (true){
			for (Volatile unOiseau : laColonie) {
			}
			
			
		}
		
		
	}
 
}
  
  
