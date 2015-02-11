public class Oiseau implements Volatile {

	final static int VIE_MAX = 120;
	private Volatile etat;
	int positionX;
	int positionY;
	String sex;
	

	@Override
	public void info() {
		// etat de l'oiseau
		System.out.println("je suis un " + this.etat);
	}

	public void eclore() {
		etat = new Poussin();
	}

	public Oiseau() {
		etat = new Oeuf();
	}

  @Override
  public void seDeplacer() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void seReproduire() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mourir() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void adulte() {
    // TODO Auto-generated method stub
    
  }

}
