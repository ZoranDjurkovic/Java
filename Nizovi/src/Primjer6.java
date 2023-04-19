import java.util.Scanner;

public class Primjer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj calnova niza");

		int n = ulaz.nextInt();

		int x[] = new int[n];

		for (int i = 0; i < x.length; i++) {
			System.out.print("[" + i + "] = ");
			x[i] = ulaz.nextInt();

		}
		int cifra;
		for (int i = 0; i < x.length; i++) {
			int p = 1;
			int a = x[i];
			while (a > 0) {
				cifra = a % 10;
				p *= cifra;
				a /= 10;
			}
			System.out.println("Proizvod cifara clana niza " + x[i] + " je " + p);
		}
		ulaz.close();

	}

}
