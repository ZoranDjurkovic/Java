import java.util.Scanner;

public class Npr13 {
	public static void main(String[] args) {

		int brojevi;

		Scanner sc = new Scanner(System.in);
		System.out.println("Od koliko hocete brojeva artimeticku sredinu");
		brojevi = sc.nextInt();
		int suma = 0;
		int ariSredina = 0;

		for (int i = 1; i <= brojevi; i++) {

			System.out.println("Unesite " + i + " broj > ");
			int sabirak = sc.nextInt();
			suma = suma + sabirak;
			ariSredina = suma / brojevi;
		}
		System.out.println("Aritmeticka sredina brojeva iznosi" + ariSredina);
	}

}
