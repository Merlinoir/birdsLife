import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;


public class testSeDeplacer {

  @Test
  //Test pour un déplacement d'une seconde
  public void testSeDeplacerUneSeconde() {
    Oiseau cuicui= new Oiseau();
    cuicui.eclore();
    //j'impose à cuicui une position   OK
    cuicui.setPosition(1.0,0.0);
    //System.out.println(cuicui.position);*/
    
    //je crée un nex point où l'oiseau devrait etre en 1 seconde (x+1)
    Point newPosition = new Point (2,0);
  //  newPosition.setLocation(2.0,0.0);
    System.out.println("newPosition imposée : " + newPosition);

    //je fais se déplacer l'oiseau d'une seconde
    long tempsTest = 1;
    cuicui.seDeplacer(tempsTest);
    
    //l'oiseau devrait etre à la position attendue soit celle du point newPosition donc X=2.0 et Y=0.0
    System.out.println(" la position de cuicui :" + cuicui.position); //il n'a pas bougé !!!!
    
    //je verifie si l'oiseau est là où il devrait etre
    //AssertTrue
    assertTrue(cuicui.getLocation().equals(newPosition));
 //   assert();
   
  }
  
  @Test
  //Test pour un déplacement à la limite droite de l'univers
  public void testSeDeplacerLimiteDroite() {
    Oiseau cuicui2= new Oiseau();
    //j'impose à cuicui une position
    cuicui2.setPosition(99.0,0.0);
    System.out.println(cuicui2.position);
    
    long tempsTest = 3;
    cuicui2.seDeplacer(tempsTest);
    //l'oiseau doit etre à la position attendue soit celle du point newPosition donc X=2.0 et Y=0.0
    Point newPosition = new Point ();
    newPosition.setLocation(95.0,0.0);
    System.out.println(cuicui2.position);
    assert(cuicui2.getLocation() == newPosition);
   
  }

}
