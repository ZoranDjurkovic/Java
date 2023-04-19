import java.util.Scanner;

public class Primjer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza n");
		int n = ulaz.nextInt();

		int x[] = new int[n];

		for (int i = 0; i < x.length; i++) {
			System.out.println("[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}

		int cifra;
		for (int i = 0; i < x.length; i++) {
			int max = 0, a = x[i];
			while (a != 0) {
				cifra = a % 10;
				if (cifra > max)
					max = cifra;
				a /= 10;
				// System.out.println("Najveca cifra clana " + x[i] + " je" + max);
			}
			System.out.println("Najveca cifra clana " + x[i] + " je" + max);
		}
		// System.out.println("Najveca cifra clana " + x[i] + " je" + max);
		ulaz.close();
	}

}
