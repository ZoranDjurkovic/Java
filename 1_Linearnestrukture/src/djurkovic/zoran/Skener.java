package djurkovic.zoran;

import java.util.Scanner;

public class Skener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Unesite ime : ");

		String userName = scanner.nextLine();
		System.out.println("Unesite broj godina ");
		int brojGodina = scanner.nextInt();
		System.out.println("Ime: " + userName + "\n" + "Broj godina: " + brojGodina);

		scanner.close();
	}

}
