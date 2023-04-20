import java.util.Scanner;

public class Npr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi: n=");

		int n = sc.nextInt();

		int s = 0;
		if (n <= 100)
			for (int i = 1; i <= n; i++) {

				if (i % 2 == 0) {

					System.out.println(i);

				}

			}
	}
}