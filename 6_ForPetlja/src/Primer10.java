import java.util.Scanner;

public class Primer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost za n");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite vrednost za a ");
			double a = input.nextDouble();
			double y;

			if (a > 0)
				y = Math.sqrt(a);
			else
				y = a * a;

			System.out.println("Za unetu vrednost a = " + a + " dobije se y = " + y);

		}
		input.close();
		if (n == 0) {
			System.out.println("Vrednost za n mora biti veca od nule");
		}
	}

}
