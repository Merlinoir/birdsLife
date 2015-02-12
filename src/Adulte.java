
public class Adulte extends Volatile {

  
  
  @Override
  public void info() {
    // TODO Auto-generated method stub
    System.out.println("je suis un adulte");
  }

  public void seDeplacer(int temps) {
    //doit prendre un parametre : temps ???? vitesse ????
    //un oiseau a 2 attributs --> X et Y
    //au départ ils sont à la position du poussin
    //les oiseaux se deplacent en ligne droite de A vers un point B donc vers Y=aX+b
    this.position.move((int) Math.random(),(int) Math.random());
    while (true) {
      //     this.position.move((int) Math.random(),(int) Math.random());
         }
    
  }

  public void seReproduire() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void seDeplacer() {
    // TODO Auto-generated method stub
    
  }

}
