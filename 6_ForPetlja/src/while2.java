import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		int n;

		System.out.println("Unesite vrednmost za n ");
		n = ulaz.nextInt();

		int i = 1;

		while (i <= n) {
			if (i % 2 != 0)
				System.out.println(i);
			i++;
		}
		ulaz.close();
	}

}
