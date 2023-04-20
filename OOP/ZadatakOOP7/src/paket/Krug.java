package paket;

public class Krug {

	// Deklarisanje podataka poluprecnik

	double poluprecnik;

	// Podrazumjevani konstruktor

	public Krug() {
		poluprecnik = 0.0;

	}

	// Parametrizovani konstruktor
	public Krug(double noviPoluprecnik) {
		this.poluprecnik = noviPoluprecnik;

	}

	// Metoda za izvrsavanje tj izracunavanje povrsine kruga
	double povrsina() {
		return Math.PI * poluprecnik * poluprecnik;
	}

	// Metoda za izracunavanje obima kruga
	double obim() {
		return 2 * poluprecnik * Math.PI;

	}

}
