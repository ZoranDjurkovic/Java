package paket;

public class Suma {

	// deklarisanje podatka n
	private int n;

	// Parametrizovani konstruktor
	Suma(int n) {
		this.n = n;
	}

	// Metoda za izracunavanje vrednosti sume do zadatog broja n

	double sumiratiDoN() {
		double s = 0.0;

		for (int i = 1; i <= n; i++)
			s += i;
		return s;
	}

	// Metoda za izracunavanje vrednosti sume sa zadatim uslovom

	double sumiratiSaUslovom() {
		double s = 0.0;

		for (int i = 1; i <= n; i++) {
			if (i != 3)
				s += (double) (i + 2) / (i - 3);
		}

		return 15 + s;

	}

	// Metoda za Izracunavanje vrednosti dvostruke sume

	double dvostrukaSuma() {
		double s = 0.0;

		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= i; j++)
				if (j != 3)
					s += (double) (j + 2) / (j - 3);
		return 15 + s;
	}

}
