import java.util.Scanner;

public class Npr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n broj");
		int n = sc.nextInt();

		int faktorjel = 1;

		for (int i = 1; i <= n; i++) {
			faktorjel = faktorjel * i;

		}
		System.out.println("Faktorijel broja " + n + " iznosi " + faktorjel);
	}

}
