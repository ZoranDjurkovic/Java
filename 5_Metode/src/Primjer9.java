import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primjer9 {

	static void prikaziMatricu(int matrica[][], int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print(" " + matrica[i][j]);

			System.out.println();
		}
	}

	static void zamenaElemenata(int matrica[][], int n) {
		for (int i = 1; i <= n; i++) {
			int temp = matrica[i][i];
			matrica[i][i] = matrica[i][n - 1 + i];
			matrica[i][n - i + 1] = temp;
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int[][] matrica = new int[10][10];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite dimenzije matrice: ");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elemente matrice ");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				System.out.print("[" + i + "][" + j + "] ");
				matrica[i][j] = Integer.parseInt(ulaz.readLine());
			}

		System.out.println("Stampanje matrice pre zamena elemenata");
		prikaziMatricu(matrica, n);
		System.out.println("Stampanje matrice nakon zamene elemenata ");
		zamenaElemenata(matrica, n);
		prikaziMatricu(matrica, n);

	}

}
