package djurkovic.zoran;

import java.util.Scanner;

public class Ugao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" unesite vrednost ugla u radijanimna");

		double x = input.nextDouble();

		System.out.println("Cosinus zadatog ugla " + Math.cos(x));
		System.out.println("Sinus zadatog ugla " + Math.sin(x));

		input.close();
	}

}
