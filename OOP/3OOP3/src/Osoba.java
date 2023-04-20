
public class Osoba {

	public String ime, datumRodjenja, adresaStanovanja;

	// konstruktor
	// ukoliko ne navedemo konstruktor, pozvace se podrazumevani konstruktor

	public String ispisi() {
		return "IMe " + ime + "\n" + "Datume rodjenja " + datumRodjenja + "\n" + "Adresa " + adresaStanovanja + "\n";
	}

}
