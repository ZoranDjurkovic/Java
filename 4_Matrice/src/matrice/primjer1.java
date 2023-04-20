package matrice;

public class primjer1 {
	public static void main(String[] args) {

		int[][] a = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		// Stampanje elemenata dvodimenzialnog niza

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
