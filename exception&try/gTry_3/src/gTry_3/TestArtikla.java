package gTry_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestArtikla {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka o artiklu

		System.out.println("Unesite naziv artikla: ");
		String naziv = ulaz.readLine();
		System.out.println("Unesite proizvodjaca artikla: ");
		String proizvodjac = ulaz.readLine();
		System.out.println("Unesite barkod artikla: ");
		String barkod = ulaz.readLine();
		System.out.println("Unesite cenu artikla: ");
		double cena = Double.parseDouble(ulaz.readLine());

		// Izrada niza objekata klase Artikal

		Artikal a = new Artikal();

		try {
			// Postavljanje podataka o artiklu

			a.setNaziv(naziv);
			a.setProizvodjac(proizvodjac);
			a.setBarkod(barkod);
			a.setCena(cena);

			// Stampanje podatka o artiklu

			System.out.println("\nUneni podaci o artiklu su: ");
			System.out.println(a.toString());
		} catch (IzuzetakArtikla e) {
			System.out.println("Greska: " + e.getMessage());
		}

	}

}
