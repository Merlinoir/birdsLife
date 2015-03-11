import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;


public class testSeDeplacer {

  @Test
  //Test pour un déplacement d'une seconde
  public void testSeDeplacerUneSeconde() {
    //creer un univers
    Univers monUnivers = new Univers ();
    Oiseau cuicui= new Oiseau();
    monUnivers.addVolatile(cuicui);
    cuicui.eclore();
    //j'impose à cuicui une position   OK
    cuicui.setPosition(1.0,0.0);
       
    //je crée un new point où l'oiseau devrait etre en 1 seconde (x+1)
    Point newPosition = new Point (2,0);
    System.out.println("newPosition imposée : " + newPosition);

    //je fais se déplacer l'oiseau d'une seconde
    long tempsTest = 1;
    cuicui.seDeplacer(tempsTest);
    
    //l'oiseau devrait etre à la position attendue soit celle du point newPosition donc X=2.0 et Y=0.0
    System.out.println(" la position de cuicui :" + cuicui.position); 
    
    //je verifie si l'oiseau est là où il devrait etre
    assertTrue(cuicui.getLocation().equals(newPosition));
  }
  
  @Test
  //Test pour un déplacement à la limite droite
  public void testSeDeplacerDroite() {
    //creer un univers
    Univers monUnivers = new Univers ();
    Oiseau cuicui1= new Oiseau();
    monUnivers.addVolatile(cuicui1);
    cuicui1.eclore();
    //j'impose à cuicui une position
    cuicui1.setPosition(97.0,0.0);
    
    //je crée un new point où l'oiseau devrait etre en 7 seconde
    Point newPosition = new Point (100,0);
    System.out.println("newPosition imposée : " + newPosition);

    //je fais se déplacer l'oiseau de 7 secondes
    long tempsTest = 7;
    cuicui1.seDeplacer(tempsTest);
    
    //l'oiseau devrait etre à la position attendue soit le max de la fenetre
    System.out.println(" la position de cuicui :" + cuicui1.position); 
    
    //Verifier si l'oiseau est là où il devrait etre
    //AssertTrue
    assertTrue(cuicui1.getLocation().equals(newPosition));
  }
  
}
