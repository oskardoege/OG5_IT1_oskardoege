
public abstract class person {
	private String name;
    private String telNr;
    private boolean jahresbeitrag;
	
    public person(String name, String telNr, boolean jahresbeitrag) {
		this.name = name;
		this.telNr = telNr;
		this.jahresbeitrag = jahresbeitrag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNr() {
		return telNr;
	}

	public void setTelNr(String telNr) {
		this.telNr = telNr;
	}

	public boolean isJahresbeitrag() {
		return jahresbeitrag;
	}

	public void setJahresbeitrag(boolean jahresbeitrag) {
		this.jahresbeitrag = jahresbeitrag;
	}
    
}
