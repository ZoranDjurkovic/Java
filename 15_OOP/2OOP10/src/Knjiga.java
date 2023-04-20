
public class Knjiga {

	private String imeKnjige;
	private double brojStrana;

	Knjiga(String a, double b) {

		imeKnjige = a;
		brojStrana = b;

	}

	public void prikaz() {
		System.out.println("Ime je i " + imeKnjige + " i broj strana" + brojStrana);
	}

}
