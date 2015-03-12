package modele;
import static org.junit.Assert.*;

import org.junit.Test;

import modele.*;

public class TestVieillir {
	
	@Test
	public void oeufToPoussin() throws InterruptedException{
		Oiseau titi = new Oiseau();
		titi.setDureeDeVie(60 * Math.pow(10, 9));
		Thread.sleep(6000);
		titi.vieillir();
		assertTrue(titi.getEtat().getClass().equals(Poussin.class));		
	}
	
	@Test
	public void oeufToAdulte() throws InterruptedException{
		Oiseau titi = new Oiseau();
		titi.setDureeDeVie(60 * Math.pow(10, 9));
		Thread.sleep(21000);
		titi.vieillir();
		assertTrue(titi.getEtat().getClass().equals(Adulte.class));		
	}
	
	@Test
	public void oeufToDeath() throws InterruptedException{
		Oiseau titi = new Oiseau();
		titi.setDureeDeVie(60 * Math.pow(10, 9));
		Thread.sleep(61000);
		titi.vieillir();
		assertTrue(titi.isEstVivant() == false);		
	}

}
