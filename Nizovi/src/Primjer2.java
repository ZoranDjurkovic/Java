import java.util.Scanner;

public class Primjer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza n");
		int n = ulaz.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite clanove niza ");

		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}

		int p = 1;
		for (int i = 0; i < x.length; i++)
			if (x[i] >= 3 && x[i] <= 9)
				p *= x[i];

		System.out.println("P = " + p);

		ulaz.close();

	}

}
