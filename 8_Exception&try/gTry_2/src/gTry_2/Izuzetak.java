package gTry_2;

public class Izuzetak extends Exception {

	private int indeksStudenta;

	// Podrazumevani konstruktor

	public Izuzetak() {
		indeksStudenta = -1;
	}

	public Izuzetak(int indeksStudenta) {
		super("Desio se izuzetak:broj indeksa studenta je veci od 100");
		this.indeksStudenta = indeksStudenta;
	}

	// Uzimanje indeksa studenta za koji se desila greska
	public int getIndeksStudenta() {
		return indeksStudenta;
	}

}
