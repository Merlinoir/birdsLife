import java.awt.Point;

public class Poussin extends Volatile {
  

  @Override
  public void info() {
    System.out.println("je suis un poussin");
  }

  public void seDeplacer(long tempsEnSeconde) {
    // Le poussin a un déplacement limité y=0
    if (this.position.x < monUnivers. MAX_UNIVERS_ABSCISSE) {
        this.position.setLocation((this.position.x+(tempsEnSeconde*vitesse)), 0.d);
        System.out.println("methode sedeplacerpoussin : "+ this.position);
        //si j'atteinds la limite droite, je repars à gauche
    } else if (this.position.x > monUnivers. MIN_UNIVERS_ABSCISSE) {
        this.position.setLocation((this.position.getX() -(tempsEnSeconde*vitesse)), 0.d);
        //si j'atteinds la limite gauche, je repars à droite
    }
  }

    public void seReproduire() {
      // Le poussin ne se reproduit pas
    }

  }
