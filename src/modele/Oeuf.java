package modele;
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
   public void seDeplacer(long tempsEnSeconde) {
    // L'oeuf ne se déplace pas
   }
  
  public void seReproduire() {
    // L'oeuf ne se reproduit pas 
    
  }

}
