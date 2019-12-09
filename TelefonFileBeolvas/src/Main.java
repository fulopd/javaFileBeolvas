import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		for (Telefon telefon : fileBeolva()) {
			System.out.println(telefon.getMarka() +" " + telefon.getTipus() + " "  + telefon.getKiadasEve());
		}
		
	}
	
	
	public static List<Telefon> fileBeolva(){
		List<Telefon> telefonok = new ArrayList<>();		
		try {
			List<String> sorok = Files.readAllLines(Paths.get("src/adatok.csv"));			
			for (String sor : sorok.subList(1, sorok.size())) {
				String[] adat = sor.split(";");
				Telefon o = new Telefon(adat[0], adat[1], Integer.parseInt(adat[2]));
				telefonok.add(o);
			}
		} catch (IOException e) {
			System.err.println("Hiba a beolvasásnál" + e);
		}
		
		return telefonok;
	
	}
	
	

}
