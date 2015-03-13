package modele;

import controle.Univers;

public class Oeuf extends Volatile {
	
	@Override
	protected boolean isMajeur() {
		return false;
	}

  public void info() {
    //affichage
    System.out.println("je suis un oeuf");
  }
 
   @Override
   public void seDeplacer(double tempsEnSeconde) {
    // L'oeuf ne se déplace pas
   }
  
  public void seReproduire() {
    // L'oeuf ne se reproduit pas 
    
  }

  @Override
  public Univers getUnivers() {
    System.out.println("appel a un etat de getMonUnivers");
    return monUnivers;
  }

  @Override
  public void setUnivers(Univers univers) {
    // TODO Auto-generated method stub
    
  }

}
