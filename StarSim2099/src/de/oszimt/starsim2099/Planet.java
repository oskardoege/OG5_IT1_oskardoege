package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	private double posx;
	private double posy;
	private int anzahlHafen;
	private String name; 
	public Planet(double posx, double posy, int anzahlHafen, String name) {
		
		this.posx = posx;
		this.posy = posy;
		this.anzahlHafen = anzahlHafen;
		this.name = name;
	}
	// Methoden


	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}

	public double getPosx() {
		return posx;
	}

	public void setPosx(double posx) {
		this.posx = posx;
	}

	public double getPosy() {
		return posy;
	}

	public void setPosy(double posy) {
		this.posy = posy;
	}

	public int getAnzahlHafen() {
		return anzahlHafen;
	}

	public void setAnzahlHafen(int anzahlHafen) {
		this.anzahlHafen = anzahlHafen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// Darstellung
}
