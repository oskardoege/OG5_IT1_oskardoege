package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute
	private double posX;
	private double posY;
	private int winkel;
	private String typ; 
	private String antrieb;
	private int maxKapazitaet;
	// Methoden
	public Raumschiff(double posX, double posY, int winkel, String typ, String antrieb, int maxKapazitaet) {
		super();
		this.posX = posX;
		this.posY = posX;
		this.winkel = winkel;
		this.typ = typ;
		this.antrieb = antrieb;
		this.maxKapazitaet = maxKapazitaet;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public int getWinkel() {
		return winkel;
	}

	public void setWinkel(int winkel) {
		this.winkel = winkel;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getAntrieb() {
		return antrieb;
	}

	public void setAntrieb(String antrieb) {
		this.antrieb = antrieb;
	}

	public int getMaxkapazitaet() {
		return maxKapazitaet;
	}

	public void setMaxkapazitaet(int maxKapazitaet) {
		this.maxKapazitaet = maxKapazitaet;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}
	

}
