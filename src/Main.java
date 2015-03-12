
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Univers monUnivers = new Univers ();
    Oiseau unOiseau = new Oiseau();
    monUnivers.addVolatile(unOiseau);
    
    unOiseau.info();
       
    unOiseau.eclore();
    unOiseau.info();
   
    unOiseau.seDeplacer(2);
    
    Sex unSexe = Sex.Femelle ;
    
    System.out.println(unSexe);
  }

}
