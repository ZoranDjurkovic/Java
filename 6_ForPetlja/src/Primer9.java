import java.util.Scanner;

public class Primer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double a, b, y;

		System.out.println("Unesite vrednost za n");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite vrednost broja a");
			a = input.nextDouble();
			System.out.println("Unesite vrednost broja b");
			b = input.nextDouble();

			if (a >= 0)
				y = (1 - Math.min(a, b)) / (Math.max(a, b));
			else
				y = Math.min(a, b) / (Math.min(a * a, b * b) + 3);

			System.out.println("Za unete vrednosti a = " + a + " i b = " + " dobija se y = " + y);
		}
		input.close();
	}

}
