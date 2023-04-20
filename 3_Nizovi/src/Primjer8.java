import java.util.Scanner;

public class Primjer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza");
		int n = ulaz.nextInt();

		int x[] = new int[n];

		for (int i = 0; i < x.length; i++) {
			System.out.print("[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}

		double y;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0)
				y = (double) 1 / x[i];
			else
				y = x[i] * x[i];

			System.out.println("Za " + x[i] + " dobija se y = " + y);
		}
		ulaz.close();
	}

}
