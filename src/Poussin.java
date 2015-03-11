import java.awt.Point;

public class Poussin extends Volatile {
  

  private boolean droite ;

  @Override
  public void info() {
    System.out.println("je suis un poussin");
  }

  public void seDeplacer(long tempsEnSeconde) {
    //aller à droite.lorsqu'il atteint la limite de l'univers, il va à gauche (le booléen change de sens)
    // Le poussin a un déplacement limité y=0
    //boolean droite= (this.position.x+(tempsEnSeconde*vitesse) < monUnivers. MAX_UNIVERS_ABSCISSE);
    if (droite ) {
      this.position.setLocation((this.position.x+(tempsEnSeconde*vitesse)), 0.d);
      if ( this.position.x > monUnivers.MAX_UNIVERS_ABSCISSE )
      {
        this.position.x = monUnivers.MAX_UNIVERS_ABSCISSE ;
        droite = false;
      }
        System.out.println("methode seDeplacerPoussin : "+ this.position);
        //si j'atteinds la limite droite, je repars à gauche
    } else 
        this.position.setLocation((this.position.getX() -(tempsEnSeconde*vitesse)), 0.d);
      if ( this.position.x < monUnivers.MIN_UNIVERS_ABSCISSE )
      {
        this.position.x = monUnivers.MIN_UNIVERS_ABSCISSE ;
        droite = true;
      }
    }

    public void seReproduire() {
      // Le poussin ne se reproduit pas
    }

  }
