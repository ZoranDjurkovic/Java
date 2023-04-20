import java.util.Scanner;

public class Primjer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza n");

		int n = ulaz.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite calnove niza");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}

		for (int i = 1; i < n; i++)
			if ((x[i - 1] + x[i]) % 2 == 0)
				System.out.println(x[i - 1] + "  " + x[i]);

		ulaz.close();

	}

}
