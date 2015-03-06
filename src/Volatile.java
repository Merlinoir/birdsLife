import java.awt.Point;

public abstract class Volatile {
  final static int VIE_MAX = 120;
  String sex;
  Oiseau parent1;
  Oiseau parent2;
  Point position;
  protected Univers monUnivers;
  
  public void info(){
  }
 
  public void seDeplacer(){
  }
  
  public void seReproduire(){
  }
 
  public void getPosition(){
  }

  public void setUnivert(Univers univers) {
    monUnivers = univers;
    
  }
 
}
