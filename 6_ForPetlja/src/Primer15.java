import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer15 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Inicijalizacija podataka o sumamam pozitivnih i negativnih celih brojeva

		int sp = 0, sn = 0;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("unesite vrednost za n ");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unos celih brojeva");

		for (int i = 1; i <= n; i++) {
			// Unose celih brojeva
			System.out.println(i + " .broj");
			int m = Integer.parseInt(ulaz.readLine());

			// Izracunaj sume

			if (m > 0)
				sp += m;
			else
				sn += n;

		}

		System.out.println("Zbir pozitivnih brojeva je " + sp + " a negativnih " + sn);

	}

}
