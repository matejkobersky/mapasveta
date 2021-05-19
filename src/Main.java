
import java.io.FileNotFoundException;
	import java.io.IOException;

	
	public class Main {

		
		public static void main(String[] args) {
					try {
						MapaSveta mapa = MapaSveta.nacti("mapa.csv");
						System.out.println("Misto: "+mapa.nazevAktualniPolohy());
						mapa.jdiNa(0);
						System.out.println("Misto: "+mapa.nazevAktualniPolohy());
						mapa.jdiNa(1);
						System.out.println("Misto: "+mapa.nazevAktualniPolohy());
						mapa.jdiNa(1);
						System.out.println("Misto: "+mapa.nazevAktualniPolohy());
						if(!mapa.jdiNa(1)) {
							System.out.println("nelze");
						}
						System.out.println("Misto: "+mapa.nazevAktualniPolohy());
					} catch(FileNotFoundException e) {
						System.out.println("Soubor s mapou hern�ho sv�ta nebyl nalezen.");
					} catch (IOException ex) {
						System.out.println("Nastal probl�m p�i �ten� dat ze souboru.");
					} catch (Exception ex) {
						System.out.println("Data v souboru nep�estavuj� mapu sv�ta.");
						System.out.print("Pokud nen� probl�m s daty v souboru, asi jste p�i programov�n� pokazili");
						System.out.print("je�t� n�co jin�ho.");
					}

		}

	}