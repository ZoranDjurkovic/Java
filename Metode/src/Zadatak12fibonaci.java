import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak12fibonaci
{
	// Definisanje rekurzivne metode
	public static int fibonaci(int i) {
		if (i <= 1)
			return i;
		else
			return fibonaci(i - 1) + fibonaci(i - 2);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite n = ");
		int n = Integer.parseInt(ulaz.readLine());

		// Stampanje fibonacijevih brojeva
		for (int i = 1; i <= n; i++)
			System.out.print(fibonaci(i - 1) + " ");
	}

}
