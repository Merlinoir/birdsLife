package metier;

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

	public Oiseau seReproduire(Oiseau autreParent) {
		return null;
	}

	public Point getLocation() {
		return position;
	}

	public void getPosition() {
	}

	public void setPosition(double i, double j) {
		this.position.setLocation(i, j);
	}

	// Méthode retournant les ancetres d'un Oiseau avec en parametres son degré
	// de parenté
	public ArrayList<Volatile> aPourAncetres(int niveau) {
		ArrayList<Volatile> listAncetres = new ArrayList<Volatile>();

		if (niveau == 1) {
			listAncetres.addAll(this.getListeParents());
			return listAncetres;
		} else {
			for (Volatile unParent : listeParents) {
				listAncetres.addAll(unParent.aPourAncetres(niveau - 1));
			}
		}
		return listAncetres;
	}

	// Récupérer dans une liste tous les Ancetres d'un Volatile :

	public ArrayList<Volatile> tousLesAncetres() {
		// Initialise la liste a retourner :
		ArrayList<Volatile> listAncetres = new ArrayList<Volatile>();
		// Ajout des parents de la cible à la liste des ancetres.
		if (!listeParents.isEmpty()) {
			listAncetres.addAll(this.getListeParents());
		}
		// Boucle foreach sur la liste de ses parents pour appel recursif
		for (Volatile unParent : listeParents) {
			unParent.tousLesAncetres();
		}
		return listAncetres;
	}

	public void kill() {
		this.estVivant = false;
	}

	public double getDureeDeVie() {
		return dureeDeVie;
	}

	public void setDureeDeVie(double dureeDeVie) {
		this.dureeDeVie = dureeDeVie;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
