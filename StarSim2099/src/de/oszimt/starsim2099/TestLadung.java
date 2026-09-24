package de.oszimt.starsim2099;

public class TestLadung {

	public static void main(String[] args) {

		double posx = (double)(Math.random() * 160);
		double posy = (double)(Math.random() * 50);
		int masse = 122;
		String typ = "Test-Ladung (gepunktet)";
		
		Ladung meineLadung = new Ladung(posx,posy,masse,typ);
		meineLadung.setTyp(typ);
		meineLadung.setMasse(masse);
		meineLadung.setPosx(posx);
		meineLadung.setPosy(posy);
		
		if (meineLadung.getTyp().equals(typ))
			System.out.println("Implementierung 'Typ'  korrekt!");
		
		if (meineLadung.getMasse() == masse)
			System.out.println("Implementierung 'Masse'  korrekt!");
		
		if (meineLadung.getPosx() == posy)
			System.out.println("Implementierung 'Position X' korrekt!");
		
		if (meineLadung.getPosy() == posy)
			System.out.println("Implementierung 'Position Y' korrekt!");

	}

}
