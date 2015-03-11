import java.awt.Point;

public abstract class Volatile {
  long  dureeDeVie;
  String sex;
  Oiseau parent1;
  Oiseau parent2;
  Point position;
  long vitesse;
  protected Univers monUnivers;
  long age;
  boolean estVivant;

  
  public void info(){
  }
 
  public void seDeplacer(long tempsEnSeconde){
    //quelle unité de temps choisir???
    
  }
  
  public void seReproduire(){
  }
 
  public Point getLocation(){
    return position;
  }
  

  public void setPosition(double i, double j) {
        this.position.setLocation(i, j);
  }
  
  public void kill(){
	  this.estVivant = false;
  }

  public void vieillir(long t){
	  this.age = this.age + t ;
	  if (this.age >= this.dureeDeVie){
		  this.kill();
	  }
  }
  public void setUnivers(Univers univers) {
    monUnivers = univers;
    
  }

}
