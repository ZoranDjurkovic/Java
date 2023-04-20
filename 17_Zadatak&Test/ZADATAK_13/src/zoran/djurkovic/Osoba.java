package zoran.djurkovic;

public class Osoba {
	
	private String ime;
	private String datumRodjenja;
	private String adresa;
	
	public Osoba (String ime, String datumRodjenja,String adresa) {
		if (ime != null) {
			this.ime = ime;
			this.datumRodjenja = datumRodjenja;
			this.adresa = adresa;
		}else {
			System.out.println("Greska> vrednost imena marka ne smije biti null");
		}
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if(ime != null) {
		this.ime = ime;
	}else {
		System.out.println("Greska> vrednost imena marka ne smije biti null");
	}
	}
	
	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		if(datumRodjenja != null) {
	
		this.datumRodjenja = datumRodjenja;
	}else {
		System.out.println("Greska> vrednost datum rodjenja marka ne smije biti null");
	}
	}
	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		if(adresa != null) {
		this.adresa = adresa;
	}else {
		System.out.println("Greska> vrednost datum rodjenja marka ne smije biti null");
	}

}
}