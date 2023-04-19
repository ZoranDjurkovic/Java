import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vjezba5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj elemenata n niza a:");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elemente niza a:");
		for (int i = 1; i <= n; i++) {
			System.out.print("a [" + i + "] =");
			a[i] = Integer.parseInt(ulaz.readLine());
		}

		// Stampanje niza pre sortiranja

		System.out.println("Niz a pre sortiranja");
		for (int i = 1; i <= 1; i++) {
			System.out.println(a[i] + "");
		}

		// SORTIRANJE ELEMENATA NIZA

		for (int i = 1; i <= n - 1; i++)
			for (int j = i + 1; j <= n; j++) {
				if (a[i] <= a[j]) {
					// Zamen elemenata niza a
					int pom = a[i];
					a[i] = a[j];
					a[j] = pom;

				}

			}

		System.out.println("\nNiz a posle sortiranja");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + " ");

	}

}
