import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primjer17 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double f[] = new double[1001];
		double s;
		int i, n, broj;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj izmedju 1 i 1000");
		broj = Integer.parseInt(ulaz.readLine());

		if (broj < 1 || broj > 1000)
			System.out.println("Greska");
		else {
			f[1] = 0.5;
			for (n = 2; n <= broj; n++) {
				s = 0;
				for (i = 1; i <= n - 1; i++)
					s += f[i] * f[n - i];

				f[n] = s;
			}

			System.out.println("F(" + broj + ") = " + f[broj]);
		}
	}

}
