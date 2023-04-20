import java.util.Scanner;

public class while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		int i, k, n, suma = 0;

		System.out.println("Unesite vrednost za n ");
		k = ulaz.nextInt();
		System.out.println("Unesite vrednost za a");
		n = ulaz.nextInt();

		i = k;

		while (i <= n) {

			suma += i; //
			i++; // suma +=i++;
		}
		System.out.println("Od " + k + " do " + n + " suma = " + suma);
		ulaz.close();
	}

}
