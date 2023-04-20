package paket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TestKrug {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Izrada objekta klase Krug
		Krug[] k = new Krug[10];

		DecimalFormat df = new DecimalFormat();

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka n

		System.out.println("Unesite vrednost za n ");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos poluprecnika krugova

		System.out.println("Unesite poluprecnike krugova ");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ".poluprecnik");
			k[i] = new Krug(Double.parseDouble(ulaz.readLine()));
		}

		// Stampanje zaglavlja
		System.out.println("\nR.Br.\tPoluprecnik\tPovrsina\tObim");

		// Stampanje rezultata

		for (int i = 1; i <= n; i++)
			System.out.println(
					i + "\t" + k[i].poluprecnik + "\t" + df.format(k[i].povrsina()) + "\t" + df.format(k[i].obim()));

	}

}
