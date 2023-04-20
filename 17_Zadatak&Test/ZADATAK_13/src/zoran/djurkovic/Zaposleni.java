package zoran.djurkovic;

public class Zaposleni extends Osoba
{
	private String firma;
	private String dioFirme;
	
	public Zaposleni (String ime, String datumRodjenja,String adresa,String firma, String dioFirme) {
		super(ime, datumRodjenja, adresa);
		this.firma = firma;
		this.dioFirme = dioFirme;
	
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getDioFirme() {
		return dioFirme;
	}

	public void setDioFirme(String dioFirme) {
		this.dioFirme = dioFirme;
	}

}
