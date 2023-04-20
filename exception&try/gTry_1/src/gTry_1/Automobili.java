package gTry_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Automobili {

	// Deklarisanje podataka
	String naziv;
	String proizvodjac;
	int godiste;
	double potrosnja;

	// Metoda za unos naziva automibila

	void unetiNaziAvutomobila() throws IOException {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite naziv aoutomobila - ");
		naziv = ulaz.readLine();
	}

	// Metoda za unos proizvodjaca automobila

	void unetiProizvodjacaAutomobila() throws IOException {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite proizvodjaca automobila - ");
		proizvodjac = ulaz.readLine();

	}
	// Metoda za unos godista automobila

	void unetiGodisteAutomobila() {
		try {
			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Unesite godiste automobila ");
			godiste = Integer.parseInt(ulaz.readLine());

		} catch (Exception e) {
			System.out.println("niste dob ro unijeli broj");
			unetiGodisteAutomobila();
		}
	}
	// Metoda za unos potrosnje automobila

	void unetiPotrosnjuAutomobila() {
		while (true) {
			try {
				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Unesite potrosnju automobila na 100 kilometara");
				potrosnja = Double.parseDouble(ulaz.readLine());
				break;
			} catch (Exception e) {
				System.out.println("Niste pravilno unijeli potrosnju automobila ");
			}
		}

	}
	// Redefinisana metoda

	public String toString() {
		return "Naziv " + naziv + "\nProizvodjac " + proizvodjac + "\nGodiste " + godiste + "\nPotrosnja " + potrosnja;
	}
}
