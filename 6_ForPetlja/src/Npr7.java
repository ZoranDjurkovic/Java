import java.util.Scanner;

public class Npr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n");
		int n = sc.nextInt();
		System.out.println("Unesite m");
		int m = sc.nextInt();
		sc.close();
		int suma = 0;

		for (int i = 1; i <= m; i++) {

			suma = suma + n * (n + i * m);
		}
		System.out.println("S je za " + n + " i " + m + " iznosi " + suma);
	}

}
