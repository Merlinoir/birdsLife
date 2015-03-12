package modele;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import controle.Univers;

public abstract class Volatile {

	double dureeDeVie;
	Sex sonSexe;  // Enum
	final double ZONE_DE_REPRODUCTION = 20 ;
	List<Volatile> listeParents;
	Point position;
	long dateNaissance;
	boolean estVivant;
	protected Univers monUnivers;
	long vitesse;

	public boolean estProche(Volatile v) {
		double ecartX;
		double ecartY;
		double distance;
		ecartX = Math.pow((v.position.getX() - this.position.getX()), 2);
		ecartY = Math.pow((v.position.getY() - this.position.getY()), 2);
		distance = Math.sqrt(ecartX + ecartY);
		// racine((x2-x1) au carré + (y2-y1) au carré)
		return (distance <= ZONE_DE_REPRODUCTION);
	}

	// Getter Setter Parent :
	public List<Volatile> getListeParents() {
		return listeParents;
	}

	public void setListeParents(List<Volatile> listeParents) {
		this.listeParents = listeParents;
	}

	public void info() {
	}

	public void seDeplacer(long tempsEnSeconde) {
		// quelle unité de temps choisir???

	}
	
	/**
	 * @param v Volatile
	 * @return retourne vrai si les deux oiseaux sont de sexe opposé
	 */
	public boolean sexeOppose(Volatile v){
	return (this.sonSexe != v.sonSexe) ;
	}
  
	public boolean lesDeuxSontMajeurs (Volatile v)
	{
		return (isMajeur() && v.isMajeur() );
	}
	protected abstract boolean isMajeur() ;


	/**
	 * @param v Volatile
	 * @return Vrai si la reproduction est possible
	 */
	public boolean reproductionPossible(Volatile v) {
		if (! this.estProche(v) ) { return false; }
		if (! this.lesDeuxSontMajeurs(v) )  { return false; }
		if (! sexeOppose(v) ) { return false; }
		
		return true;

		}
		
		
		

	/**
	 * 
	 * @param autreParent
	 * @return
	 */
	public Oiseau seReproduire(Oiseau autreParent) {
		return null;
	}



	/**
	 * Methode retournant un oiseau est ses ancetres avec
	 * en parametre son degre de parente
	 * @param Niveau de parente : 1= parents 2= Gds Parents etc...
	 * @return Liste de Volatile Parametree
	 * @author Frederic & Franck
	 */
	public ArrayList<Volatile> aPourAncetres(int niveau) {
		ArrayList<Volatile> listParamAncetres = new ArrayList<Volatile>();
		// Mettre dans la liste l'oiseau lui meme
		listParamAncetres.add(this) ;
		// remonter vers les ascendants en fonction du parametre :
		if (niveau == 1) {
			listParamAncetres.addAll(this.getListeParents());
			return listParamAncetres;
		} else {
			for (Volatile unParent : listeParents) {
				listParamAncetres.addAll(unParent.aPourAncetres(niveau - 1));
			}
		}
		return listParamAncetres;
	}


	/**
	 * Methode retournant un oiseau est ses ancetres
	 * @return Liste de Volatile
	 * @author Frederic & Franck
	 */
	public ArrayList<Volatile> tousLesAncetres() {
		// Initialise la liste a retourner :
		ArrayList<Volatile> listTousAncetres = new ArrayList<Volatile>();
		
		// Mettre dans la liste l'oiseau lui meme
		listTousAncetres.add(this) ;
		
		// Ajout des parents de la cible à la liste des ancetres.
		if (!listeParents.isEmpty()) {
			listTousAncetres.addAll(this.getListeParents());
		}
		// Boucle foreach sur la liste de ses parents pour appel recursif
		for (Volatile unParent : listeParents) {
			unParent.tousLesAncetres();
		}
		return listTousAncetres;
	}

	public void ancetreEnCommun(Volatile v) {
	
//		liste1 ArrayList<Volatile> = this.tousLesAncetres();
//		for 
	
	
	}
	
	
	
	public void kill() {
		this.estVivant = false;
	}
	
	// Getter Setter
	
	public Point getLocation() {
		return position;
	}

	public void getPosition() {
	}

	public void setPosition(double i, double j) {
		this.position.setLocation(i, j);
	}
	
	public double getDureeDeVie() {
		return dureeDeVie;
	}

	public void setDureeDeVie(double dureeDeVie) {
		this.dureeDeVie = dureeDeVie;
	}



	public Sex getSonSexe() {
		return sonSexe;
	}

	public void setSonSexe(Sex sonSexe) {
		this.sonSexe = sonSexe;
	}

	public long getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(long dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public boolean isEstVivant() {
		return estVivant;
	}

	public void setEstVivant(boolean estVivant) {
		this.estVivant = estVivant;
	}

	public Univers getMonUnivers() {
		return monUnivers;
	}

	public void setMonUnivers(Univers monUnivers) {
		this.monUnivers = monUnivers;
	}

	public long getVitesse() {
		return vitesse;
	}

	public void setVitesse(long vitesse) {
		this.vitesse = vitesse;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public void setUnivers(Univers univers) {
		monUnivers = univers;

	}

}
