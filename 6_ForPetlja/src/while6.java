
public class while6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double xO = 18.0;
		double x1 = 30.0 / (xO * xO) - 42 / xO + 18.0;

		// Ciklicna struktura

		while (Math.abs(x1 - xO) > 1.0E-5) {
			xO = x1;
			x1 = 30.0 / (xO * xO) + 42.0 / xO + 18;
		}
		// Stampanje rezultata
		System.out.println("Dobijena vrednost za x = " + x1);
	}

}
