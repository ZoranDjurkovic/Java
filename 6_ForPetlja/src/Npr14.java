import java.util.Scanner;

public class Npr14 {

	public static void main(String[] args) {

		int suma = 0, sredina = 0, parni = 0;
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.println("Koliko brojeva zelite da unesete");
			int broj = input.nextInt();
			if (broj % 2 == 0) {
				parni++;
				suma = suma + broj;
				sredina = suma / parni;

			}
			input.close();
		}
		System.out.println("Aritmeticka sredina unetih parnih brojeva je>" + sredina);

	}

}
