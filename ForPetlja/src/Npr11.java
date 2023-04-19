import java.util.Scanner;

public class Npr11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi: n=");

		int n = sc.nextInt();
		int s, d, j;
		for (int i = 100; i <= 999; i++) {

			s = n / 100;
			d = (n % 10) / 10;
			j = n % 10;

			if (n == (s * s * s + d * d * d * +j * j * j)) {
				System.out.println(n);
			}

		}

	}

}
