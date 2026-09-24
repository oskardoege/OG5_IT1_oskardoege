package de.oszimt.starsim2099;

public class Main {

	public static void main(String[] args) {

		
		// GameControl erstellen
		GameControl meinGame = new GameControl();
		
		// Universum einrichten
		int universumBreite = 320;
		int universumHoehe = 100;
		Universum meinUniversum = new Universum(universumBreite, universumHoehe);
		meinGame.setUniversum(meinUniversum);
		
		// Raumschiff hinzufügen
		Raumschiff meinStarCarrier = new Raumschiff(universumHoehe, universumHoehe, universumHoehe, null, null, universumHoehe);
		meinStarCarrier.setTyp("Star-Carrier DF100");
		meinStarCarrier.setAntrieb("Sol 8");
		meinStarCarrier.setMaxkapazitaet(250);
		meinStarCarrier.setPosX(universumBreite / 2);
		meinStarCarrier.setPosY(universumHoehe  / 2);
		meinStarCarrier.setWinkel(180);
		meinGame.setRaumschiff(meinStarCarrier);
		
		// Pilot hinzufügen
		Pilot meinHansSolo = new Pilot(universumHoehe, universumHoehe, null, null);
		meinHansSolo.setName("Hans Solo");
		meinHansSolo.setGrad("Offzs. 2");
		meinHansSolo.setPosx(Math.random() * universumBreite);
		meinHansSolo.setPosx(Math.random() * universumHoehe);
		meinGame.setPilot(meinHansSolo);
		
		// Planeten hinzufügen
		Planet meineErde = new Planet(universumHoehe, universumHoehe, universumHoehe, null);
		meineErde.setName("Erde");
		meineErde.setAnzahlHafen(2);
		meineErde.setPosx(Math.random() * universumBreite);
		meineErde.setPosx(Math.random() * universumHoehe);
		meinGame.addPlanet(meineErde);

		Planet meinCentaurus = new Planet(universumHoehe, universumHoehe, universumHoehe, null);
		meinCentaurus.setName("Centaurus 7");
		meinCentaurus.setAnzahlHafen(1);
		meinCentaurus.setPosx(Math.random() * universumBreite);
		meinCentaurus.setPosx(Math.random() * universumHoehe);
		meinGame.addPlanet(meinCentaurus);

		// Monde hinzufügen
				Mond meinemond = new Mond();
				meinemond.setName("Mond");
				meinemond.setErzart("Adamantium");
				meinemond.setArt("Mond");
				meinemond.setPosx(Math.random() * universumBreite);
				meinemond.setPosx(Math.random() * universumHoehe);
				meinGame.addMond(meinemond);

				
		//// Ladungen hinzufügen
		// Pamps (grün)
		Ladung meinePampsGruen = new Ladung(universumHoehe, universumHoehe, universumHoehe, null  );
		meinePampsGruen.setTyp("Pamps (grün)");
		meinePampsGruen.setMasse(120);
		meinePampsGruen.setPosx(Math.random() * universumBreite);
		meinePampsGruen.setPosy(Math.random() * universumHoehe);
		meinGame.addLadung(meinePampsGruen);

		// Pamps (gelb)
		Ladung meinePampsGelb = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinePampsGelb.setTyp("Pamps (gelb)");
		meinePampsGelb.setMasse(130);
		meinePampsGelb.setPosx(Math.random() * universumBreite);
		meinePampsGelb.setPosy(Math.random() * universumHoehe);
		meinGame.addLadung(meinePampsGelb);
		
		// klingonischer Werkzeugstahl
		Ladung meinStahl = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinStahl.setTyp("klingonischer Werkzeugstahl");
		meinStahl.setMasse(400);
		meinStahl.setPosx(Math.random() * universumBreite);
		meinStahl.setPosy(Math.random() * universumHoehe);
		meinGame.addLadung(meinStahl);
		
		// Borg-Schrott
		Ladung meinSchrott = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinSchrott.setTyp("Borg-Schrott");
		meinSchrott.setMasse(100);
		meinSchrott.setPosx(Math.random() * universumBreite);
		meinSchrott.setPosy(Math.random() * universumHoehe);
		meinGame.addLadung(meinSchrott);
		
		// Treibstoff
		Ladung meinTreibstoff = new Ladung(universumHoehe, universumHoehe, universumHoehe, null);
		meinTreibstoff.setTyp("Treibstoff Nukleus 1000");
		meinTreibstoff.setMasse(50);
		meinTreibstoff.setPosx(Math.random() * universumBreite);
		meinTreibstoff.setPosy(Math.random() * universumHoehe);
		meinGame.addLadung(meinTreibstoff);
		
		// Starte Spiel
		meinGame.run();

	}

}
