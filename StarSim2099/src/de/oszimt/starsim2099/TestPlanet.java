package de.oszimt.starsim2099;

public class TestPlanet {

	public static void main(String[] args) {
		double posx = (double)(Math.random() * 160);
		double posy = (double)(Math.random() * 50);
		int anzahlHafen = 3;
		String name = "Max Musterpilot";
		
		Planet meinPlanet = new Planet(posx,posy,anzahlHafen,name);
		meinPlanet.setAnzahlHafen(anzahlHafen);
		meinPlanet.setName(name);
		meinPlanet.setPosx(posx);
		meinPlanet.setPosy(posy);
		
		if (meinPlanet.getAnzahlHafen() == anzahlHafen)
			System.out.println("Implementierung 'Hafen' korrekt!");
		
		if (meinPlanet.getName().equals(name))
			System.out.println("Implementierung 'Name'  korrekt!");
		
		if (meinPlanet.getPosx() == posx)
			System.out.println("Implementierung 'Position X' korrekt!");
		
		if (meinPlanet.getPosy() == posy)
			System.out.println("Implementierung 'Position Y' korrekt!");
	}

}
