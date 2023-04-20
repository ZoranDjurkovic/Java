
public class Zadatak9 {
	// Definisanje metode BubbleSort

	public static void bubbleSort(int n, int[] x) {
		int pom;

		for (int i = 1; i < n; i++)
			for (int j = n - 1; j >= 1; j--) {
				if (x[j - 1] > x[j]) {
					// Zamene mesta elementa niza
					pom = x[j - 1];
					x[j - 1] = x[j];
					x[j] = pom;
				}
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = { 2, 7, 5, 8, 1 };
		int n = 5;

		// Prikaz ne sortiranog niza
		System.out.print("Nesortirani niz");
		for (int i = 0; i < n; i++)
			System.out.print(" " + x[i]);

		// Poziv metode

		bubbleSort(n, x);

		// Prikaz sortiranog niza
		System.out.print("\nSortirani niz: ");
		for (int i = 0; i < n; i++)
			System.out.print(" " + x[i]);
	}

}
