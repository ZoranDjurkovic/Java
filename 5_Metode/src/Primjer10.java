import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primjer10 {
	static void prikaziMatricu(int matrica[][], int n, int m) {
		for (int i = 1; i <= n; n++)
			for (int j = 1; j <= m; n++) {
				System.out.print(" " + matrica[i][j]);
				System.out.println();
			}
	}

	static void transponovanje(int m1[][], int m2[][], int v, int k) {
		for (int i = 1; i <= v; i++)
			for (int j = 1; j <= k; j++)
				m2[j][i] = m1[i][j];
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int[][] matrica = new int[10][10];
		int[][] b = new int[10][10];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite dimenziju vrste n matrice: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite dimenziju vrste m matrice: ");
		int m = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elemente matrice ");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++) {
				System.out.print("[" + i + "][" + j + "] = ");
				matrica[i][j] = Integer.parseInt(ulaz.readLine());

			}
		System.out.println("Stampanje matrice pre zamene elemenata");
		prikaziMatricu(matrica, n, m);

		System.out.println("Stampanje matrice nakon zamene elemenata");
		transponovanje(matrica, b, n, m);
		prikaziMatricu(b, m, n);
	}

}
