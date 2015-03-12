import java.util.ArrayList;


public class Adulte extends Volatile {

  
  
  @Override
  public void info() {
    System.out.println("je suis un adulte");
  }

  public void seDeplacer(int temps) {
    //doit prendre un parametre : temps ???? vitesse ????
    //au départ ils sont à la position du poussin
    //les oiseaux se deplacent en ligne droite de A vers un point B donc vers Y=aX+b??
    this.position.move((int) Math.random(),(int) Math.random());
    while (true) {
      //     this.position.move((int) Math.random(),(int) Math.random());
         }
  }
	
	// un oiseau cible se reproduit avec un autre oiseau en parametre
	public Oiseau seReproduire (Oiseau autreParent)
	{
		ArrayList<Volatile> lesParents = new ArrayList<Volatile> ();
		lesParents.add(autreParent);
		lesParents.add(this);
		return new Oiseau(lesParents); // Nouvel Oiseau avec ses Parents
	}
  
	
	// Méthode retournant les ancetres d'un Oiseau avec en parametres son degré de parenté
	// degré de parenté 1 : Freres Soeurs
	// degré de parenté 2 : Cousins Cousines
	// degré de parenté 3 : Cousins germains...
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

	
	public ArrayList<Volatile> tousLesAncetres() {
		return null;
	}
	

	// Methodes de controle :
	public boolean reproduction(Oiseau o){
		// On ignore si un oiseau est mort.
		return true ;
	}

	public boolean distanceProche(Oiseau o){
		return true;
	}
	
	public boolean familleDifferente(Oiseau o){
	
		// 1er point :
		// Vérifier que les deux oiseaux soient de sexe différent 
		// méthode dans la classe Oiseau
		
		
		// 2eme point :
		// On compare si le pere de l'oiseau cible est le pere de l'oiseau o ou de l'un de ses aieux !
		// recursion
		
		
		// 3eme point :
		// On compare si la mere de l'oiseau cible est la mere de l'oiseau o ou de l'un de ses aieux !
		// recursion		
		
		return true;
	}
	
	
	/*
	 * Methodologie :
	 * verifier qu'une méthode fasse ce pour quoi elle faite et RIEN de plus
	 * Pas d'appel de B dans A pour etre sur de passer par A avant de commencer B
	 * Il faut que A ne fasse que son job
	 * Et c'est à B de faire au debut une verif de la methode A avant de continuer
	 * il est possible de lancer A sans avoir besoin de B !
	 * 
	 * Verifier les parametres en entrée ET en sortie (different de null)
	 * 
	 * 
	 * 
	 */
	
	

}
