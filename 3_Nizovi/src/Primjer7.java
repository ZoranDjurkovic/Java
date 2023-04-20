import java.util.Scanner;

public class Primjer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza");
		int n = ulaz.nextInt();

		int x[] = new int[n];

		for (int i = 0; i < x.length; i++) {
			System.out.print("[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		int s = 0;
		for (int i = 0; i < x.length; i++)
			if (x[i] % 10 == 5)
				s += x[i];
		System.out.println("Suma je " + s);
		ulaz.close();
	}

}
