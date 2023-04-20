package zoran.djurkovic;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		
		Random proiz = new Random();
		

		 
		System.out.println("Nasumicni brojevi");
		int proizvoInt = proiz.nextInt();
		double proizvoDouble = proiz.nextDouble();
		float proizvoFloat = proiz.nextFloat();
		boolean proizBul = proiz.nextBoolean();
		
		byte [] proizBajtNiz = new byte [1]; //kreiran niz velicine jednog mjesta tj indeksa
		proiz.nextBytes(proizBajtNiz);
		
		System.out.println("Int: " + proizvoInt);
		System.out.println("Double: " + proizvoDouble);
		System.out.println("Float: " + proizvoFloat);
		System.out.println("Boolean: " + proizBul);
		
		System.out.println("Byte " + Arrays.toString(proizBajtNiz));
	}

}
