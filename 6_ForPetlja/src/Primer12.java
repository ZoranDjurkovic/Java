
public class Primer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stampan je zaglavlja

		System.out.println("\tT\tS1\tS2\tS=|s1-s2|");

		for (int t = 0; t <= 15; t++) {
			// iyracunavanje predjenih puteva

			double s1 = 2 * Math.pow(t, 3) + Math.pow(t, 2);
			double s2 = 2 * Math.pow(t, 2) + 5 * t;
			double s = Math.abs(s1 - s2);

			System.out.println("\t" + t + "\t" + s1 + "\t" + s2 + "\t" + s);
		}
	}

}
