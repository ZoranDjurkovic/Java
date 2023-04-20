
public class Zadatak11 {
	// Defiisanje rekurzivne metode

	public static void hanoj(char a, char b, char c, int n) {
		if (n > 0) {
			hanoj(a, c, b, n - 1);
			System.out.println(a + "->" + b);
			hanoj(c, b, a, n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hanoj('A', 'B', 'C', 4); // za slucaj 4 diska

	}

}
