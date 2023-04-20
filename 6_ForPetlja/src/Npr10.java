import java.util.Scanner;

public class Npr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi: n=");

		int n = sc.nextInt();
		System.out.print("Unesi: m=");

		int m = sc.nextInt();
		sc.close();

		for (int i = n; i <= m; i++) {

			if (i % 3 == 0) {

				System.out.print(i + "  ");
			}
		}

	}

}
