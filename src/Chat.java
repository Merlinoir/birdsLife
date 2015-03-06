import java.util.ArrayList;
import java.util.List;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class Chat {

	List<Chat> listeParents ;
	
	// constructeur
	Chat()
	{
		listeParents = new ArrayList<Chat>();
	}
	
	// constructeur de chat avec ses parents en parametres
	Chat(List<Chat> parents) {
		listeParents = parents;
	}
	
	// un chat cible se reproduit avec un autre chat en parametre
	Chat seReproduire (Chat autreParent)
	{
		ArrayList<Chat> lesParents = new ArrayList<Chat> ();
		lesParents.add(autreParent);
		lesParents.add(this);
		return new Chat(lesParents); // Nouveau Chat avec ses Parents
	}
	
	public ArrayList<Chat> aPourAncetres(int niveau) {
		// retourne une liste d'ancetres avec en paramètres le degré de parenté
		ArrayList<Chat> listAncetres = new ArrayList<Chat>() ;
		
		if (niveau==1) { 
			listAncetres.addAll(this.getListeParents());
			return listAncetres ;
		}
		else{
			for ( Chat unParent : listeParents ){
				listAncetres.addAll( unParent.aPourAncetres(niveau-1));
			}
		}
		return listAncetres;
	}
	// Creer la meme methode mais sans parametres pour retourner
	// la liste des parents sans limite de remontee
	
	// Getter Setter
	
	public List<Chat> getListeParents() {
		return listeParents;
	}

	public void setListeParents(List<Chat> listeParents) {
		this.listeParents = listeParents;
	}

	
	
	
	
	
	
	
	
	
}

