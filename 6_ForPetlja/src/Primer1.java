import java.text.DecimalFormat;

public class Primer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");

		// inicijalizacija promenjive S

		double s = 0;

		// Izracunavanja vrednosti sume

		for (int n = 1; n <= 50; n++)
			s += (n + 2.5) / (n * n + 1.2);

		// Stampanje izlaznog rezultata

		System.out.println("Dobijena vrednost sume je " + df.format(s));

	}
}