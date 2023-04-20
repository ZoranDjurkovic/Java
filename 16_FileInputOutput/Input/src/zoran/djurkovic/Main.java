package zoran.djurkovic;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		

		
		//Osnovne UI operacije
		
		//Za ui operacije java koristi tokove odnosno strimove
		//koji omogucuju rad sa podacima koji se primaju i salju
		
		//Klasa koja omogucuje da se poveze tastatura sa strimom je DataInputStream
		// Za ispinjave tj povezli file sa unosom FileOutputStream
		
		DataInputStream dis = new  DataInputStream(System.in);
		
		FileOutputStream fos = new FileOutputStream("rezultati.txt");
		
		System.out.println("Unesite strinfg (unos prekinite karakterom  $)");
		
		//read()
		//write()
		char ch;
		while((ch = (char) dis.read())  != '$') {
			
			fos.write(ch);
			
		}
		fos.close();
	}

}
