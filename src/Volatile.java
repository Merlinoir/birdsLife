import java.awt.Point;

public abstract class Volatile {
  long  dureeDeVie;
  String sex;
  Oiseau parent1;
  Oiseau parent2;
  Point position;

  protected Univers monUnivers;

  long age;
  boolean estVivant;

  
  public void info(){
  }
 
  public void seDeplacer(){
  }
  
  public void seReproduire(){
  }
 
  public void getPosition(){
  }
  
  public void kill(){
	  this.estVivant = false;
  }

  public void vieillir(long t){
	  this.age = this.age + t ;
	  if (this.age >= this.dureeDeVie){
		  this.kill();
	  }

  public void setUnivert(Univers univers) {
    monUnivers = univers;
    
  }

}
