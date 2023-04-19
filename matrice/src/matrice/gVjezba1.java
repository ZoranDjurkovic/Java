package matrice;

public class gVjezba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 2, -3, -5 }, { -1, 4, 5 }, { 1, -3, -4 } };

		int[][] b = new int[5][5];

		for (int i = 0; i <= 2; i++)
			for (int j = 0; j <= 2; j++)
				b[i][j] = a[j][i];

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++)
				System.out.print(b[i][j] + " ");

			System.out.println();
		}

	}

}
