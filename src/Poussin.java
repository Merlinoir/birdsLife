import java.awt.Point;

public class Poussin extends Volatile {

  @Override
  public void info() {
    System.out.println("je suis un poussin");
  }

  public void seDeplacer() {
    // Le poussin a un déplacment limité y=0

    while (true) {
 //     this.position.move((int) Math.random(),0);
    }

  }

  public void seReproduire() {
    // Le poussin ne se reproduit pas
  }

}
