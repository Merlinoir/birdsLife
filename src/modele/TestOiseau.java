package modele;
import static org.junit.Assert.*;
import modele.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestOiseau {

	long  dureeDeVie;
	String sex;
	List<Volatile> listeParents;
	Point position;
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	// Getter Setter Parent :
	public List<Volatile> getListeParents() {
			return listeParents;
	}
	public void setListeParents(List<Volatile> listeParents) {
		this.listeParents = listeParents;
	}


// Méthode retournant les ancetres d'un Oiseau avec en parametres son degré de parenté
	public ArrayList<Volatile> aPourAncetres(int niveau) {
		ArrayList<Volatile> listAncetres = new ArrayList<Volatile>() ;
		
		// Instancier les Oiseaux test :
		Oiseau GdpereMontaiguP = new Oiseau() ;
		Oiseau GdmereMontaiguP = new Oiseau() ;
		Oiseau GdpereMontaiguM = new Oiseau() ;
		Oiseau GdmereMontaiguM = new Oiseau() ;
		Oiseau pereMontaigu = new Oiseau() ;
		Oiseau mereMontaigu = new Oiseau() ;
		Oiseau filsMontaigu = new Oiseau() ;
		filsMontaigu.getListeParents().add(pereMontaigu) ;
		filsMontaigu.getListeParents().add(mereMontaigu) ;
		pereMontaigu.getListeParents().add(GdpereMontaiguP) ;
		pereMontaigu.getListeParents().add(GdmereMontaiguP) ;
		mereMontaigu.getListeParents().add(GdpereMontaiguM) ;
		mereMontaigu.getListeParents().add(GdmereMontaiguM) ;
		
		
//		Oiseau GdpereCapuletP = new Oiseau() ;
//		Oiseau GdmereCapuletP = new Oiseau() ;
//		Oiseau GdpereCapuletM = new Oiseau() ;
//		Oiseau GdmereCapuletM = new Oiseau() ;
//		Oiseau pereCapulet = new Oiseau() ;
//		Oiseau mereCapulet = new Oiseau() ;
//		Oiseau filleCapulet = new Oiseau() ;
//		filleCapulet.listeParents.add(pereCapulet) ;
//		filleCapulet.listeParents.add(mereCapulet) ;
//		pereCapulet.listeParents.add(GdpereCapuletP) ;
//		pereCapulet.listeParents.add(GdmereCapuletP) ;
//		mereCapulet.listeParents.add(GdpereCapuletM) ;
//		mereCapulet.listeParents.add(GdmereCapuletM) ;
		
		listAncetres.addAll(filsMontaigu.getListeParents());
		listAncetres.addAll(filsMontaigu.getListeParents()); // sur le pere
		listAncetres.addAll(filsMontaigu.getListeParents()); // sur la mere etc on ajoute a la liste
		
		if (niveau >=1) {
			if (niveau==1) { 
				listAncetres.addAll(this.getListeParents());
				return listAncetres ;
			}
			else {
				for (Volatile unParent : listeParents) {
					listAncetres.addAll( unParent.aPourAncetres(niveau-1));
				}
			}
		}
		return listAncetres;
	}

	
	

}
