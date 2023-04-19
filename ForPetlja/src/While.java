import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		int n, i = 1;
		double s = 0;

		System.out.println("Unesite vrednmost za n ");
		n = ulaz.nextInt();

		while (i <= n) {
			s += (double) 1 / i;
			i++;
		}

		System.out.println("Suma reciprocnih vrednosti brojeva " + n + " je " + s);

		ulaz.close();
	}

}
