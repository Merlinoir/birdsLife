import java.awt.Point;


public class Poussin extends Volatile {


  private boolean droite = true;

  public Poussin (Point laOuLOiseauEtait, Univers lUnivertDeLOiseau)
  {
     System.out.println("je cree un poussin");
     position = laOuLOiseauEtait;
     vitesse = 1;
     monUnivers = lUnivertDeLOiseau;
     
  }
  @Override
  public void info() {
    System.out.println("je suis un poussin");
  }

  public void seDeplacer(long tempsEnSeconde) {
    //aller à droite. Lorsqu'il atteint la limite de l'univers, il va à gauche (le booléen change le sens)
    // Le poussin a un déplacement limité y=0
    if (droite) {
      this.position.setLocation((this.position.x+(tempsEnSeconde*vitesse)), 0.d);
      System.out.println("methode poussin sedeplacer droite :" + this.position.x);
      if ( this.position.x > monUnivers.MAX_UNIVERS_ABSCISSE )
      {
        this.position.x = monUnivers.MAX_UNIVERS_ABSCISSE ;
        droite = false;
      }
      System.out.println("methode seDeplacerPoussin : "+ this.position);
      //si la limite droite est atteinte, on repart à gauche
    } else {
      this.position.setLocation((this.position.x-(tempsEnSeconde*vitesse)), 0.d);
      if ( this.position.x < monUnivers.MIN_UNIVERS_ABSCISSE )
      {
        this.position.x = monUnivers.MIN_UNIVERS_ABSCISSE ;
        droite = true;
      }
    }
  }

  public void seReproduire() {
    // Le poussin ne se reproduit pas
  }

}
