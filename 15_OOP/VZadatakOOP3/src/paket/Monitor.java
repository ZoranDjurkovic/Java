package paket;

public class Monitor {

	private String marka;
	private int velicinaEkrana;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		if (marka != null)
			this.marka = marka;
		else
			System.out.println("Greska: vrednost podatka marka ne sme biti null");
	}

	public int getVelicinaEkrana() {
		return velicinaEkrana;
	}

	public void setVelicinaEkrana(int velicinaEkrana) {

		if (velicinaEkrana > 12)
			this.velicinaEkrana = velicinaEkrana;
		else
			System.out.println("Greska: Velicina ekrana mora biti veca od 12 incha");

	}

	public String toString() {
		return "Marka monitora: " + marka + "\nVelicina monitor: " + velicinaEkrana;
	}

}
