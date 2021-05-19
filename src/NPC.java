
public class NPC {
	private String jmeno;
	private String popis;
	public NPC(String jmeno, String popis) {
		this.jmeno=jmeno;
		this.popis=popis;
	}

	public String getJmeno() {
		return jmeno;
		
	}

	@Override
	public String toString() {
		return "NPC [jmeno=" + jmeno + ", popis=" + popis + "]";
	}

}