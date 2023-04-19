import java.util.Scanner;

public class Primjer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza n:");
		int n = ulaz.nextInt();

		double x[] = new double[n];
		double y[] = new double[n];

		System.out.println("Unesite clanove niza x");
		for (int i = 0; i < x.length; i++) {
			System.out.print("[" + i + "]=");
			x[i] = ulaz.nextDouble();

		}
		System.out.println("Unesite clanove niza y");
		for (int i = 0; i < y.length; i++) {
			System.out.println("[" + i + "]=");
			y[i] = ulaz.nextDouble();
		}
		double f;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y[i])
				f = Math.sqrt((x[i] - 0.2) / (2 + y[i]));
			else
				f = Math.sqrt((y[i] - 0.2) / (2 + x[i]));

			System.out.println("za " + x[i] + " i " + y[i] + " dobija se f = " + f);
			ulaz.close();
		}

	}

}
