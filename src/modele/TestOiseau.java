package modele;
import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
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

	public void aPourAncetresTest(int niveau) {
		ArrayList<Volatile> listAncetresTest = new ArrayList<Volatile>() ;
		
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
		
		// Famille Capulet
		Oiseau GdpereCapuletP = new Oiseau() ;
		Oiseau GdmereCapuletP = new Oiseau() ;
		Oiseau GdpereCapuletM = new Oiseau() ;
		Oiseau GdmereCapuletM = new Oiseau() ;
		Oiseau pereCapulet = new Oiseau() ;
		Oiseau mereCapulet = new Oiseau() ;
		Oiseau filleCapulet = new Oiseau() ;
		filleCapulet.listeParents.add(pereCapulet) ;
		filleCapulet.listeParents.add(mereCapulet) ;
		pereCapulet.listeParents.add(GdpereCapuletP) ;
		pereCapulet.listeParents.add(GdmereCapuletP) ;
		mereCapulet.listeParents.add(GdpereCapuletM) ;
		mereCapulet.listeParents.add(GdmereCapuletM) ;
		
		// listAncetres.addAll(filsMontaigu.getListeParents());  // On ne met pas le fils lui meme
		listAncetresTest.addAll(pereMontaigu.getListeParents());
		listAncetresTest.addAll(mereMontaigu.getListeParents());
		listAncetresTest.addAll(GdmereMontaiguM.getListeParents());
		listAncetresTest.addAll(GdpereMontaiguM.getListeParents());
		listAncetresTest.addAll(GdmereMontaiguP.getListeParents());
		listAncetresTest.addAll(GdpereMontaiguP.getListeParents());
		
		// utiliser ici la methode de la classe pour la Famille Capulet
		ArrayList<Volatile> test = filleCapulet.aPourAncetres(2) ;
		
		// Comparaison des deux resultats :
		assertTrue ( Collections.disjoint( listAncetresTest, test )) ;
	}

	

}
