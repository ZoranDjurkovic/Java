package paket;

public class Knjiga {

	// deklarisanje podataka
	private String naslov;
	private String autor;
	private String isbn;

	// Metoda za pristup pudatku naslov

	public String getNaslov() {
		return naslov;
	}

	// Metoda za postavljanje podatka naslov

	public void setNaslov(String naslov) {
		if (naslov != null)
			this.naslov = naslov;
		else
			System.out.println("Greska: vrednost podatka naslov ne sme biti null");
	}

	// Metoda za pristup podatku autor

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor != null)
			this.autor = autor;
		else
			System.out.println("Greska: vrednost podatka autor ne sme biti null");
	}

	// Metoda za pristup podatku isbn

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		if (isbn != null)
			this.isbn = isbn;
		else
			System.out.println("Greska: vrednost podatka isbn  ne sme biti null");
	}

	// redefinisana metoda
	public String toString() {
		return "Naslov: " + naslov + "\nAutor " + autor + "\nISBN " + isbn;
	}

}
