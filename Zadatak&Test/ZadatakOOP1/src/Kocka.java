
public class Kocka {

	// Deklarisanje podatka stranice
	private double stranica;

	// Podrazumevani konstruktor
	public Kocka(double stranica) {
		this.stranica = stranica;
	}

	// Metoda zaizracunavanje zapremine kocke
	double zapremina() {
		return Math.pow(stranica, 3);
	}

	// Metoda za izvrsavanje povrsine kocke
	double povrsina() {
		return 6 * Math.pow(stranica, 2);
	}

	// Metoda za pristup podatku stranica

	public double getStranica() {
		return stranica;
	}

	// Metoda za postavljanje podatka stranica
	public void setStranica(double stranica) {
		this.stranica = stranica;
	}
}
