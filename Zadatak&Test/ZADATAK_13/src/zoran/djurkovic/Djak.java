package zoran.djurkovic;

public class Djak extends Osoba{
	
	private String skola;
	private String razred;
	
	public Djak (String ime, String datumRodjenja,String adresa, String skola,String razred) {
		super(ime, datumRodjenja, adresa);
		this.razred = razred;
		this.skola = skola;
	}

	

	public String getSkola() {
		return skola;
	}

	public void setSkola(String skola) {
		this.skola = skola;
	}

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}
	
	

}
