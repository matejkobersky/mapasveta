
import java.io.Serializable;
import java.util.ArrayList;


public class Lokalita implements Serializable{
	
	private String nazev;

	private int id;
	
	private ArrayList<NPC>npcc = new ArrayList<NPC>();
	private ArrayList<Item> items=new ArrayList<>();
	public void pridejNPC (NPC npc) {
		npcc.add(npc);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public NPC odejdi(int index) {
		NPC npc = npcc.get(index);
		npcc.remove(index);
		return npc;
	}
	
	
	public void setNpcs(ArrayList<NPC> npcs) {
		this.npcc = npcs;
	}
	

	int[] smery = new int[4]; 
	
	
	
	public Lokalita(String nazev, int id){
	}
	
	
	public void pøipojLokalitu(int smer, int kam) {              
	}    
	
	
	public String toString() {
		return null;
	}

	
	public int getId() {
		return 0;
	}

	
	public void setId(int id) {
	}
	
	
	public int getSmer(int smer) { 
		return 0;
	}
}

