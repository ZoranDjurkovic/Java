import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak6 {

	// Definisanje metode
	static int f(int x, int y, int z) {
		int f = (y < z) ? y : z;
		if (x > f)
			f = x;
		return f;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Deklarisanje podataka
		int x, y, z;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.println("Unesite vrednost za x");
		x = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za y");
		y = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za z");
		z = Integer.parseInt(ulaz.readLine());

		// Stampanje rezultata
		System.out.println("Dobijena vrednost izraza f je " + f(x, y, z));
	}

}
