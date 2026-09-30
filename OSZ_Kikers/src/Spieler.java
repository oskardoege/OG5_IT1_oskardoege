
public class Spieler extends person{
	private String spielposition;
	private int trikotnummer;
	
	public Spieler(String name, String telNr, boolean jahresbeitrag, String spielposition, int trikotnummer) {
		super(name, telNr, jahresbeitrag);
		this.spielposition = spielposition;
		this.trikotnummer = trikotnummer;
	}

	public String getSpielposition() {
		return spielposition;
	}

	public void setSpielposition(String spielposition) {
		this.spielposition = spielposition;
	}

	public int getTrikotnummer() {
		return trikotnummer;
	}

	public void setTrikotnummer(int trikotnummer) {
		this.trikotnummer = trikotnummer;
	}
	
	
}
