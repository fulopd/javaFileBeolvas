import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Telefon> telefonok = new ArrayList();		
		try {
			List<String> sorok = Files.readAllLines(Paths.get("src/adatok.csv"));
			sorok.remove(0);
			for (String sor : sorok) {
				String[] adat = sor.split(";");
				Telefon o = new Telefon(adat[0], adat[1], Integer.parseInt(adat[2]));
				telefonok.add(o);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Telefon telefon : telefonok) {
			System.out.println(telefon.getMarka() +" " + telefon.getTipus() + " "  + telefon.getKiadasEve());
		}
		
	}
	
	

}
