import java.util.Scanner;

public class Npr4 {

	public static void main(String[] args) {
		int brojSabiraka;

		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva hocete da sabaeret");
		brojSabiraka = sc.nextInt();

		int zbir = 0;
		for (int i = 1; i <= brojSabiraka; i++) {
			System.out.println("Unesite broj" + i + "");

			int sabirak = sc.nextInt();
			zbir = zbir + sabirak;

		}

		System.out.println("Zbir brojeva iznosi" + zbir);
		sc.close();

	}

}
