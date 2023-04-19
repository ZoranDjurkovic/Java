import java.util.Scanner;

public class while7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		int n;
		double s = 0;

		System.out.println("Unewsite vrednost za n ");
		n = ulaz.nextInt();

		int i = 1;

		while (i <= n) {

			s += 1 / (double) (2 * i);
			i++;
		}

		System.out.println("n = " + n + " s = " + s);
		ulaz.close();

	}

}
