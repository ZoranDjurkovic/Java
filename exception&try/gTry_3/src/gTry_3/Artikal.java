package gTry_3;

public class Artikal {

	String naziv;
	String proizvodjac;
	String barkod;
	double cena;

	// Metoda za prisutup podatku naziv
	public String getNaziv() {
		return naziv;
	}

	// Metoda za postavljanje podatka naziv
	public void setNaziv(String naziv) throws IzuzetakArtikla {
		if (naziv == null)
			throw new IzuzetakArtikla("Naziv artikla ne smije biti null");

		this.naziv = naziv;
	}

	// Metoda za pristup podatku proizvodjac
	public String getProizvodjac() {
		return proizvodjac;
	}
	// Metoda za postavljanje podatka proizvodjac

	public void setProizvodjac(String proizvodjac) throws IzuzetakArtikla {
		if (proizvodjac == null)
			throw new IzuzetakArtikla("Proizvodjac artikla ne smije biti null");

		this.proizvodjac = proizvodjac;
	}

	// Metoda za pristup podatku barkod
	public String getBarkod() {
		return barkod;
	}
	// Metoda za postavljanje podatka bar kod

	public void setBarkod(String barkod) throws IzuzetakArtikla {
		if (barkod == null)
			throw new IzuzetakArtikla("Barkod artikla ne smije biti null");

		this.barkod = barkod;
	}

	// Metoda za pristup podatku cenu

	public double getCena() {
		return cena;
	}

	// Metoda za postavljanje podatka cena
	public void setCena(double cena) throws IzuzetakArtikla {
		if (cena <= 0)
			throw new IzuzetakArtikla("Cena mora biti veca od null ");

		this.cena = cena;

	}
	// Metoda za ispisivanje podataka o artiklu

	public String toString() {
		return "Naziv " + naziv + "\nProizvodjac:  " + proizvodjac + "\nBarkod " + barkod + "\nCena " + cena;
	}

}
