import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vjezba7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Niz parnih i ne parnih brojeva i njihove trenutne duzine

		int[] parni = new int[100];
		int[] neparni = new int[100];

		int p = 0, n = 0;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Ucitamo broj elemenata

		System.out.println("Unesite vrednost za k");
		int k = Integer.parseInt(ulaz.readLine());

		for (int i = 1; i <= k; i++) {
			// Ucitavamo narednio element
			int x = Integer.parseInt(ulaz.readLine());
			if (x % 2 == 0) // ako je paran
				parni[p++] = x;// smestamo ga u niz parnih
			else // u suprotnom
				neparni[n++] = x;
		}
		System.out.println("Parni brojevi kuca'");
		for (int i = 0; i <= p; i++)
			System.out.println(parni[i]);

		System.out.println("Neparni brojevi kuca");
		for (int i = 0; i <= p; i++)
			System.out.println(neparni[i]);

	}

}
