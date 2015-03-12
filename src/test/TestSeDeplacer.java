package test;
import static org.junit.Assert.*;
import java.awt.Point;
import org.junit.Test;
import metier.*;


public class TestSeDeplacer {

  public Oiseau initialiserOiseau (){
  //creer un univers
    Univers monUnivers = new Univers ();
    Oiseau cuicui= new Oiseau();
    monUnivers.addVolatile(cuicui);
    cuicui.eclore();
    return cuicui;
  }
  
  @Test
  //Test pour un déplacement d'une seconde
  public void testSeDeplacerUneSeconde() {
    //j'impose à cuicui une position   OK
    Oiseau cuicui1 = initialiserOiseau().setPosition(1.0,0.0);
      
    //Créer un new point où l'oiseau devrait etre en 1 seconde (x+1)
    Point newPosition = new Point (2,0);
    
    //je fais se déplacer l'oiseau d'une seconde
    long tempsTest = 1;
    cuicui1.seDeplacer(tempsTest);
    
    //Verifier si l'oiseau est là où il devrait etre
    assertTrue(cuicui1.getLocation().equals(newPosition));
 }
  
 @Test
  //Test pour un déplacement à la limite droite de l'univers
  public void testSeDeplacerLimiteDroite() {
   Oiseau cuicui2 = initialiserOiseau().getEtat().setPosition(1.0,0.0);
   
    //j'impose à cuicui une position
    cuicui2.setPosition(99.0,0.0);
    
  //Créer un new point où l'oiseau devrait etre le max des absisses
    Point newPosition = new Point (100,0);
    
    long tempsTest = 3;
    cuicui2.seDeplacer(tempsTest);
      
    //Verifier si l'oiseau est là où il devrait etre
    assertTrue(cuicui2.getLocation() == newPosition);
   
  }

}
