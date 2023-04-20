package paket;

public class Main {

	public static void main(String[] args) {

		int d, a;
		try {
			// U try bloku se stavljaju naredbe koje mogu baciti izuyetak,
			// kao i one naredeb koje se nece izvrsit ako dodje do izuzetka
			d = 0;
			a = 10 / d;

			System.out.println("Ova poruka nece biti odstampana");
		} catch (ArithmeticException e) {
			System.out.println("Delenje nulom");
		}
		System.out.println("Program nastavlja sa izvrsenjem");

	}

}
/*
 * hijerarhija izuzetaka
 *
 * Sv izuzeci izvedeni su iz Throwable. klasa Throwable dva direkta naslednika a
 * to su Error i Exception
 * 
 * klasa Error opisuje fatalne greska.(greske na koje ne ozemo uticati) Za
 * greske tog tipa nije potrebno navoditi try/catch blokove.
 * 
 * Exception klasa jeste klase oz koje se izvode klase koje pripadaju
 * neproverenim tipovima izuzyetaka.
 * 
 * Exception{RuntineException, IOException}
 * 
 * RuntineException{IndexOutOfBoundsException,ArithmeticException}
 */