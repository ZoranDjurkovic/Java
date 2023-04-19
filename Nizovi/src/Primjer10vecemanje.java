import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primjer10vecemanje {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int x[] = new int[100]; // rezervisanje potencijalne velicine niza

		System.out.println("Unesite broj elemenata n niza x");

		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("unesite elemente niza ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = Integer.parseInt(ulaz.readLine());
		}

		int min, max;

		min = max = x[1];
		for (int i = 2; i <= n; i++) {
			if (x[i] > max)
				max = x[i];
			if (x[i] < min)
				min = x[i];
		}
		System.out.println("Maksimalni element je " + max + "\nMinimalni element " + min);
	}

}