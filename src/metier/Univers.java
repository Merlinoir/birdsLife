package metier;
import java.util.ArrayList;
import java.util.List;

public class Univers {
  final int MIN_UNIVERS_ABSCISSE = 0;
  final int MIN_UNIVERS_ORDONNEES = 0;
  final int MAX_UNIVERS_ABSCISSE = 100;
  final int MAX_UNIVERS_ORDONNEES = 100;
  List<Volatile> laColonie = new ArrayList<Volatile> ();
  

  public Univers(){
  }

  

  public void addVolatile (Volatile vola)
  {
    laColonie.add(vola);
    vola.setUnivers(this);
  }
  
  
}
