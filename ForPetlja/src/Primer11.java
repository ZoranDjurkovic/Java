import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Deklarisanje odsecaka

		double a, b, c;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za n");
		int n = Integer.parseInt(ulaz.readLine());

		for (int i = 1; i <= n; i++) {
			// Unos podataka
			System.out.println("Unesite duzinu odsecka a ");
			a = Double.parseDouble(ulaz.readLine());
			System.out.println("Unesite duzinu odsecka b ");
			b = Double.parseDouble(ulaz.readLine());
			System.out.println("Unesite duzinu odsecka c ");
			c = Double.parseDouble(ulaz.readLine());

			if (a > 0 && b > 0 && c > 0) {
				// Ispitivanje da li zadati odsecci mogu konstruisati trougao

				if ((a + b > c) && (a + c > b) && (b + c > a)) {
					double p = 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));

					System.out.println("Povrsina trougla je " + p);
				} else
					System.out.println("Unete stranice ne cine trougao");
			} else
				System.out.println("Odsecci moraju biti veci od nule");
		}
	}

}
