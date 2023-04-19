import java.text.DecimalFormat;

public class Primer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");

		// inicijalizacija promenjive
		double p = 1;

		// Izracunavanje vrednosti proizvoda
		for (int n = 1; n <= 5; n++)
			p *= (n + 2.5 / (n * n + 1.2));

		// Stanpanje izlaznog rezultata
		System.out.println("Dobijena vrednost proizvoda je " + df.format(p));

	}

}
