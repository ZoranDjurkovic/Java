
public class Zadatak7 {
	// Definisanje metode za izracunavanje vrednosti determinante reda dva

	static int det(int b1, int b2, int c1, int c2) {
		return b1 * c2 - b2 * c1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, -3, 2 }, { 4, 1, -8 }, { -7, 8, 6 } };

		// Izracunavanje vrednosti determinante reda tri

		int determinanta = a[0][0] * det(a[1][1], a[1][2], a[2][1], a[2][2])
				- a[0][1] * det(a[1][0], a[1][2], a[2][0], a[2][2]) + a[0][2] * det(a[1][0], a[1][1], a[2][0], a[2][1]);

		// Stampanje rezultata
		System.out.println("Vrednost detyerminante je " + determinanta);
	}

}
