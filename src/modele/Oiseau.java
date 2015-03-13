package modele;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hamcrest.core.IsInstanceOf;

import controle.Univers;

public class Oiseau extends Volatile {

	public Volatile etat;
	final static int VIE_MAX = 60;
	final static double SEUIL_POUSSIN = 5 * Math.pow(10, 9);
	final static double SEUIL_ADULTE = 20 * Math.pow(10, 9);

	@Override
	protected boolean isMajeur() {
		return etat.isMajeur();

	}

	public void info() {
		// Etat de l'oiseau
		System.out.println("je suis un " + this.etat);
	}

	// constructeur

	{
	etat = new Oeuf();
	sonSexe = Sex.getRandomSex();
    Random rand = new Random();
    int x = rand.nextInt(300);
    int y = 300;
    //position = new Point(x, y);
    etat.position = new Point(x, y);//position;
    etat.vitesse = 0;
    vitesse = 0;
    calculerDureeDeVie();
    estVivant = true;
    dateNaissance = System.nanoTime();
	}

	void initUnivers(Univers UnUni) {
		UnUni.addVolatile(this);
		etat.monUnivers = UnUni;

	}

	public Oiseau(Univers unUni) {
		initUnivers(unUni);
		listeParents = new ArrayList<Volatile>();
	}

	public Oiseau(Univers unUni, List<Volatile> parents) {
		initUnivers(unUni);
		listeParents = parents;
	}

	/**
	 * Methode qui renvoie une couleur en fonction de l'etat de l'oiseau
	 * et s'il est mort...
	 * @return Color
	 */
	public Color colorise() {
		// Oeuf : Blanc Poussin : Jaune Adulte : Orange Mort : Gris
		if (estVivant) {
			if ( this.getEtat() instanceof Oeuf) {
				return Color.WHITE ;
			}
			if ( this.getEtat() instanceof Poussin) {
				return Color.YELLOW ;
			}
			if ( this.getEtat() instanceof Adulte) {
				return Color.RED ;
			}
		}
		return Color.GRAY;
	}
	
	
	
	
	// Changement d'etat :
	public void eclore() {
		etat = new Poussin(etat.position, etat.monUnivers);

	}

	public void puberte() {
		this.etat = new Adulte(etat.position, etat.monUnivers);

	}

	public void evoluer() {
		if (this.etat instanceof Oeuf) {
			eclore();
		} else if (this.etat instanceof Poussin) {
			puberte();
		}
	}

	public void vieillir() {
		super.vieillir();
		if (this.calculerAge() >= SEUIL_POUSSIN) {
			this.evoluer();
		}
		if (this.calculerAge() >= SEUIL_ADULTE) {
			this.evoluer();
		}

	}

	/**
	 * Methode Comparaison Etat Adulte Retourne vrai si les deux oiseaux sont
	 * des adultes.
	 */
	public boolean comparerEtats(Oiseau o) {
		return ((this.getEtat().equals(Adulte.class)) && o.getEtat().equals(
				Adulte.class));
	}

	public void seDeplacer(double tempsEnSeconde) {
		etat.seDeplacer(tempsEnSeconde);

	}

	public void setPosition(double i, double j) {
		this.etat.position.setLocation(i, j);
	}

	public Point getPosition() {
		return etat.position;
	}

	public Oiseau seReproduire(Oiseau autreparent) {
		etat.seReproduire(null);
		return null;
	}

	public ArrayList<Volatile> aPourAncetres(int niveauParente) {
		// retourne une liste d'ancetres avec en paramètres le degré de parenté
		return null;
	}

	public Volatile getEtat() {
		return etat;
	}

	public void setEtat(Volatile etat) {
		this.etat = etat;
	}

	public Sex getSonSexe() {
		return sonSexe;
	}

	public void setSonSexe(Sex sonSexe) {
		this.sonSexe = sonSexe;
	}
	
	public void setSonSexeMale(Sex sonSexe) {
	sonSexe = Sex.Male;
	}

	public void setSonSexeFemelle(Sex sonSexe) {
	sonSexe = Sex.Femelle;
	}

	@Override
	public void setUnivers(Univers univers) {
		// a voir monUnivers = univers;
		etat.monUnivers = univers;

	}

	@Override
	public Univers getUnivers() {
		return etat.monUnivers;
	}


}
