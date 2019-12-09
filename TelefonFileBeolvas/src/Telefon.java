
public class Telefon {

	private String marka;
	private String tipus;
	private int kiadasEve;
	
	public Telefon(String marka, String tipus, int kiadasEve) {		
		this.marka = marka;
		this.tipus = tipus;
		this.kiadasEve = kiadasEve;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public int getKiadasEve() {
		return kiadasEve;
	}

	public void setKiadasEve(int kiadasEve) {
		this.kiadasEve = kiadasEve;
	}
	
	
}
