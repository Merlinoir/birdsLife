package modele;

import java.util.Random;

public enum Sex {

	Male,Femelle;
	
	private static Random rand = new Random ();
	
	public static Sex getRandomSex ()
	{
		return values()[rand.nextInt(values().length)];
	}
	// class public enum
}
