
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
						System.out.println("Soubor s mapou herního svìta nebyl nalezen.");
					} catch (IOException ex) {
						System.out.println("Nastal problém pøi ètení dat ze souboru.");
					} catch (Exception ex) {
						System.out.println("Data v souboru nepøestavují mapu svìta.");
						System.out.print("Pokud není problém s daty v souboru, asi jste pøi programování pokazili");
						System.out.print("ještì nìco jiného.");
					}

		}

	}