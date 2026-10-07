package omnom;

public class Haustier {
	// Attribute (private, laut UML-Diagramm)
		private int hunger;
		private int muede;
		private int zufrieden;
		private int gesund;
		private String name;
	 
		// Konstruktoren: alle Werte werden mit 100 initialisiert
		public Haustier() {
			this.hunger = 100;
			this.muede = 100;
			this.zufrieden = 100;
			this.gesund = 100;
			this.name = "";
		}
	 
		public Haustier(String name) {
			this(); // ruft den Standardkonstruktor auf
			this.name = name;
		}
	 
		// Getter
		public int getHunger() {
			return hunger;
		}
	 
		public int getMuede() {
			return muede;
		}
	 
		public int getZufrieden() {
			return zufrieden;
		}
	 
		public int getGesund() {
			return gesund;
		}
	 
		public String getName() {
			return name;
		}
	 
		// Setter: Werte werden auf den Bereich 0 bis 100 begrenzt
		public void setHunger(int hunger) {
			this.hunger = begrenzen(hunger);
		}
	 
		public void setMuede(int muede) {
			this.muede = begrenzen(muede);
		}
	 
		public void setZufrieden(int zufrieden) {
			this.zufrieden = begrenzen(zufrieden);
		}
	 
		public void setGesund(int gesund) {
			this.gesund = begrenzen(gesund);
		}
	 
		public void setName(String name) {
			this.name = name;
		}
	 
		// Hilfsmethode: stellt sicher, dass der Wert zwischen 0 und 100 liegt
		private int begrenzen(int wert) {
			if (wert < 0) {
				return 0;
			}
			if (wert > 100) {
				return 100;
			}
			return wert;
		}
	 
		// Aktionen: Parameterwert wird auf den Attributwert aufaddiert.
		// Durch die Nutzung der Setter bleibt der Wert automatisch im Bereich 0-100.
		public void fuettern(int anzahl) {
			setHunger(hunger + anzahl);
		}
	 
		public void schlafen(int dauer) {
			setMuede(muede + dauer);
		}
	 
		public void spielen(int dauer) {
			setZufrieden(zufrieden + dauer);
		}
	 
		// Setzt die Gesundheit auf 100
		public void heilen() {
			setGesund(100);
		}
	}

