
public class Oiseau implements Volatile {
private Volatile etat;

@Override
public void info() {
  // etat de l'oiseau
  System.out.println("je suis un " +this.etat);
}

public void eclore() {
  etat=new Poussin();
}

public Oiseau(){
  etat=new Oeuf();
}



}
