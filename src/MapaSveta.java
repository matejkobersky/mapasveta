
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;


public class MapaSveta extends HashMap<Integer, Lokalita> implements Serializable {
	private int zacatek = 7; 
	private int aktualniPoloha = zacatek;
	

	public static MapaSveta nacti(String nazevSouboru) throws IOException {
		MapaSveta mapa = new MapaSveta();
		BufferedReader reader = new BufferedReader(new FileReader(nazevSouboru));
		String radek = "";
		while((radek = reader.readLine())!=null) {
			String[] pole = radek.split(";");
			Lokalita lokalita = new Lokalita(pole[1],Integer.parseInt(pole[0]));
			for(int i = 0; i < 4; i++) {
			lokalita.pøipojLokalitu(i, Integer.parseInt(pole[i+2]));
			}
			mapa.put(lokalita.getId(), lokalita);
			}
			reader.close();
			return mapa;
			}
	
	
	public String nazevAktualniPolohy() {
		return null;
	}

	public boolean jdiNa(int smer) {
		return true;
	}

}

