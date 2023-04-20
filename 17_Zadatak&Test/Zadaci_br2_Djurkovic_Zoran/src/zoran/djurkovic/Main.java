package zoran.djurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		int broj, stotica, desetica, jedinica, proizvod, sumaKubova;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Unesite trocifren broj n " );
		broj = Integer.parseInt(ulaz.readLine());
		
		stotica = broj / 100;
		desetica = (broj - stotica * 100) / 10;
		jedinica = broj - stotica * 100 - desetica *10;
		
		proizvod = stotica * desetica * jedinica;
		sumaKubova = (int) ((Math.pow(stotica, 3)) + (Math.pow(desetica, 3)) + (Math.pow(jedinica, 3)));
		
		System.out.println("Proizvod cifara je " + proizvod);
		System.out.println("Suma kubova cifara je " + sumaKubova);
		System.out.println("Uneseni broj u obrnutom redosledu  "+jedinica+""+desetica+""+stotica);
		
	}

}
