package modele;
import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import controle.Univers;

public class TestSeDeplacer {

  private Oiseau initialiseOiseau() {
    //creer un univers
    Univers monUnivers = new Univers ();
    Oiseau cuicui1= new Oiseau();
    monUnivers.addVolatile(cuicui1);
    cuicui1.eclore();
    return cuicui1;
  }
  
  @Test
  //Test pour un déplacement d'une seconde
  public void testSeDeplacerUneSeconde() {
    Oiseau cuicui1= initialiseOiseau();
    cuicui1.setPosition(1.0,0.0);

    //je crée un new point où l'oiseau devrait etre en 1 seconde (x+1)
    Point newPosition = new Point (2,0);
    System.out.println("newPosition imposée : " + newPosition);

    //je fais se déplacer l'oiseau d'une seconde
    double tempsTest = 1;
    cuicui1.seDeplacer(tempsTest);

    //l'oiseau devrait etre à la position attendue soit celle du point newPosition donc X=2.0 et Y=0.0
//    System.out.println(" la position de cuicui : " + cuicui1.getEtat().getPosition());
    

    //je verifie si l'oiseau est là où il devrait etre
    assertTrue(cuicui1.getLocation().equals(newPosition));
  }

  @Test
  //Test pour un déplacement à la limite droite
  public void testSeDeplacerDroite() {
    Oiseau cuicui2= initialiseOiseau();
    cuicui2.setPosition(97.0,0.0);

    //je crée un new point où l'oiseau devrait etre en 7 secondes
    Point newPosition = new Point (100,0);
    System.out.println("newPosition imposée : " + newPosition);

    //je fais se déplacer l'oiseau de 7 secondes
    long tempsTest = 7;
    cuicui2.seDeplacer(tempsTest);

    //l'oiseau devrait etre à la position attendue soit le max de la fenetre
//    System.out.println(" la position de cuicui :" + cuicui2.getEtat().getPosition()); 

    //Verifier si l'oiseau est là où il devrait etre
    assertTrue(cuicui2.getLocation().equals(newPosition));
  }
  
  @Test
  //Test pour un déplacement à la limite droite
  public void testSeDeplacerPoussinAuMaxDeDroite() {
    Oiseau cuicui2= initialiseOiseau();
    cuicui2.setPosition(100.0,0.0);

    //je crée un new point où l'oiseau devrait etre en 7 secondes
    Point newPosition = new Point (100,0);
    System.out.println("newPosition imposée : " + newPosition);

    //je fais se déplacer l'oiseau de 7 secondes
    long tempsTest = 7;
    cuicui2.seDeplacer(tempsTest);

    //l'oiseau devrait etre à la position attendue soit le max de la fenetre
//    System.out.println(" la position de cuicui :" + cuicui2.getEtat().getPosition()); 

    //Verifier si l'oiseau est là où il devrait etre
    assertTrue(cuicui2.getLocation().equals(newPosition));
  }
  
  @Test
  //Test pour un déplacement à la limite gauche
  public void testSeDeplacerGauche() {
    Oiseau cuicui3= initialiseOiseau();
    cuicui3.setPosition(5.0,0.0);
    
   ((Poussin)cuicui3.etat).deplacementDroite = false;

    //je crée un new point où l'oiseau devrait etre
    Point newPosition = new Point (0,0);
    System.out.println("newPosition imposée : " + newPosition);

    //je fais se déplacer l'oiseau 
    long tempsTest = 9;
    //mettre le booleen deplacementDroite à faux  -->  
    cuicui3.seDeplacer(tempsTest);

    //l'oiseau devrait etre à la position attendue soit le max de la fenetre
//    System.out.println(" la position de cuicui :" + cuicui3.getEtat().getPosition()); 

    //Verifier si l'oiseau est là où il devrait etre
    assertTrue(cuicui3.getLocation().equals(newPosition));
  }
   
}