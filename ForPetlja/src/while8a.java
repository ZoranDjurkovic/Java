import java.util.Scanner;

public class while8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		int n, s = 0;

		System.out.println("Unesite vrednost za n ");
		n = ulaz.nextInt();

		int i = 1;

		do {
			if (i % 2 != 0) {
				s += Math.pow(i, 2);
				i++;

			}
		} while (i <= n);

		System.out.println("Za unetu vrednost n = " + n + " dobija se s = " + s);

		ulaz.close();

	}

}
