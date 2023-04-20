import java.util.Scanner;

public class while7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);

		int n;
		double s = 0;

		System.out.println("Unewsite vrednost za n ");
		n = ulaz.nextInt();

		int i = 1;
		do {
			s += 1 / (double) (2 * i);
			i++;
		} while (i <= n);
		System.out.println(" n = " + n + " s = " + s);

		ulaz.close();

	}

}
