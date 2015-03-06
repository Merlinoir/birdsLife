import java.awt.Point;

public class Poussin extends Volatile {

  @Override
  public void info() {
    System.out.println("je suis un poussin");
  }

  public void seDeplacer(long t) {
    // Le poussin a un déplacement limité y=0
    if (this.position.x < monUnivers. MAX_UNIVERS_ABSCISSE) {
        this.position.setLocation(this.position.getX() +1, 0.d);
        //si j'atteinds la limite droite, je repars à gauche
    } else if (this.position.x < monUnivers. MAX_UNIVERS_ABSCISSE) {
        this.position.setLocation(this.position.getX() -1, 0.d);
        //si j'atteinds la limite gauche, je repars à droite
        this.position.setLocation(this.position.getX() +1, 0.d);
      }
  }

    public void seReproduire() {
      // Le poussin ne se reproduit pas
    }

  }
