package de.oszimt.starsim2099;

public class Mond extends MasterOfDesaster {
	private String erzart;
	private String name;
	private String art;
	public Mond() {
		}
	public String getErzart() {
		return erzart;
	}
	public void setErzart(String erzart) {
		this.erzart = erzart;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public static char[][] getDarstellung() {
		char[][] planetShape = {{ '\0', '/', '*', '*', '\\', '\0' }, 
								{ '|', '*', '*', '*', '*', '|' },
								{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
