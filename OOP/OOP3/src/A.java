
public class A {

	private String message;

	// Deklasiranje privatnih podataka vrsi se enkapsulacija - skrivanje podataka
	// Sprecava se promjena vrednosti promenjivih iz koda van zadate klase

	// podatak = atribut osobina klasa
	// Objekti imaju svoje atribute
	// atributi se predstavljaju preko promenjivih u deklaraciji klase
	// deklarisu se unutar klase van svih metoda

	// metode klase

	// metoda setMessage postavlja poruku.

	public void setMessage(String msg) {
		message = msg;// metoda je public, da bi se omogucili
	}

	// Metoda getMessage() vraca poruku

	public String getMessage() { // nema parametaa, vracaju odgovarajuci tip podataka
		return message;
	}

	// Parametri i argumenti metoda

}
