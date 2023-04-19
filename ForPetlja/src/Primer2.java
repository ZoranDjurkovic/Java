import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Inicijalizacija promenjive s

		double s = 0;

		// Unos vrednosti promenjive

		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());

		if (n < 100) {
			// IzracunaVnje vrednost sume

			for (int i = 1; i <= n; i++)
				if (i != 3)
					s += (i + 3.5) / (i - 3.0);
			// Stampanje izlaznog rezultata

			System.out.println("Dobijena vrednost sume je " + df.format(s));
		} else
			System.out.println("Treba da unesete vrednost manje od 100");
	}

}
