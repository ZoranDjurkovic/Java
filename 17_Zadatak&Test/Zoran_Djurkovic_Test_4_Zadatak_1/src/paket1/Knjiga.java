package paket1;

public class Knjiga {

	private String naslov;
	private String autor;
	private String opis;
	private String cena;
	private boolean indikatorStanja;

	public String getNaslov() { // dohvatio naslov
		return naslov;
	}

	public void setNaslov(String naslov) { // postavio naslov
		this.naslov = naslov;
	}

	public String getAutor() { // dohvatio autor
		return autor;
	}

	public void setAutor(String autor) { // postavio autor
		this.autor = autor;
	}

	public String getOpis() { // dohvatio opis
		return opis;
	}

	public void setOpis(String opis) { // postavio opis
		this.opis = opis;
	}

	public String getCena() { // dohvatio Cenu
		return cena;
	}

	public void setCena(String cena) { // postavio cenu
		this.cena = cena;
	}

	public boolean isIndikatorStanja() { // dohvatio indikator stanja
		return indikatorStanja;
	}

	public void setIndikatorStanja(boolean indikatorStanja) { // postavio indikator stanja
		this.indikatorStanja = indikatorStanja;
	}

	public String toString() {
		return " Knjiga: " + naslov + "\n Pisac : " + autor + "\n Kratak opis : " + opis + "\n Cena " + cena
				+ "\n Na stanju: " + indikatorStanja;
	}

}
