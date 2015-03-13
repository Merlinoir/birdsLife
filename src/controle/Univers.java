package controle;
import java.util.ArrayList;
import java.util.List;

import modele.Volatile;

public class Univers {
  public final int MIN_UNIVERS_ABSCISSE = 0;
  public final int MIN_UNIVERS_ORDONNEES = 0;
  public final int MAX_UNIVERS_ABSCISSE = 100;
  public final int MAX_UNIVERS_ORDONNEES = 100;
  List<Volatile> laColonie = new ArrayList<Volatile> ();
  

  public Univers(){
  }

  public void addVolatile (Volatile vola)
  {
    laColonie.add(vola);
    //vola.setUnivers(this);
  }
  
  
}
