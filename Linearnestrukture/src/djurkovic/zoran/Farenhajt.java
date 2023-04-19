package djurkovic.zoran;

import java.util.Scanner;

public class Farenhajt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite temperaturu u celzijusima ");
		double tc = input.nextDouble();

		System.out.println("Temperatura je u Farenhajtima " + (tc * 1.8 + 32));

		input.close();
	}

}
