import java.util.Scanner;

public class while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);

		int n, i = 1, s = 0;

		System.out.println("Unesite vrednost za n");
		n = ulaz.nextInt();

		while (i <= n) {
			if (i % 10 == 8)
				s += i;
			i++;
		}
		System.out.println("Suma je " + s);
		ulaz.close();
	}

}
