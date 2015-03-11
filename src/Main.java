
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Oiseau unOiseau = new Oiseau();
    unOiseau.info();
    unOiseau.eclore();
    
    unOiseau.seDeplacer(2);
    
    unOiseau.info();
    
    Sex unSexe = Sex.Femelle ;
    
    System.out.println(unSexe);
  }

}
