package matrice;

public class gVjezba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 2, -1, 0 }, { 4, 0, 2, 1 }, { 2, -5, 1, 2 } };
		int[][] b = { { 3, -4, 1, 2 }, { 1, 5, 0, 3 }, { 2, -2, 3, -1 } };
		int[][] c = new int[3][4];

		// Nalazenje zbira dve matrice
		for (int i = 0; i <= 2; i++)
			for (int j = 0; j <= 3; j++)
				c[i][j] = a[i][j] + b[i][j];
		// Stampanje izlaznog rezultata
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 3; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}

}
