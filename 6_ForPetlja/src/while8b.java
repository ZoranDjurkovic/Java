import java.util.Scanner;

public class while8b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);
		int n, s = 0;

		System.out.println("Unesite vrednost za n ");
		n = ulaz.nextInt();

		int i = 1;

		while (i < n) {
			if (i % 2 != 0) {
				s += Math.pow(i, 2);
				i++;

			}
			System.out.println("Za unetu vrednost n = " + n + " dobija se s = " + s);

			ulaz.close();
		}

	}

}
