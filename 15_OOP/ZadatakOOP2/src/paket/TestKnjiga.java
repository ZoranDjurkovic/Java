package paket;

public class TestKnjiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Izrada objekta kklase knjiga
		Knjiga k = new Knjiga();

		// Postavljanje podataka o knjizi
		k.setNaslov(" Uvod u programiranje");
		k.setAutor("Milan Gocic");
		k.setIsbn("86-80259-61-2");

		// Stampanje podataka o knjizi

		System.out.println("Podaci o knjizi su");
		System.out.println(k.toString());

	}

}
