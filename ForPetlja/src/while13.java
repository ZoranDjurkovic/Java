import java.util.Scanner;

public class while13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		int k;
		double p = 1;

		System.out.println("Unesite vrednost za k ");
		k = ulaz.nextInt();

		int i = k;

		while (i <= (2 * k))
			p *= i++;

		System.out.println("proizvod je" + p);

		ulaz.close();
	}

}
