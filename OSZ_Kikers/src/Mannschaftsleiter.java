
public class Mannschaftsleiter extends Spieler {
	private String manschaftsname;
	private int rabattAufJb;
	public Mannschaftsleiter(String name, String telNr, boolean jahresbeitrag, String spielposition, int trikotnummer,
		String manschaftsname, int rabattAufJb) {
		super(name, telNr, jahresbeitrag, spielposition, trikotnummer);
		this.manschaftsname = manschaftsname;
		this.rabattAufJb = rabattAufJb;
	}
	public String getManschaftsname() {
		return manschaftsname;
	}
	public void setManschaftsname(String manschaftsname) {
		this.manschaftsname = manschaftsname;
	}
	public int getRabattAufJb() {
		return rabattAufJb;
	}
	public void setRabattAufJb(int rabattAufJb) {
		this.rabattAufJb = rabattAufJb;
	}
	
}
