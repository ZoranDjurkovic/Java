import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vjezba9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double[] b = new double[100];
		double[] h = new double[100];
		double[] L = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite broj stapova m");
		int m = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite dimenzije poprecnog presjeka b i h i duzinu stapa L");
		for (int i = 1; i <= m; i++) {
			System.out.println(i + "stap");
			System.out.println("b= ");
			b[i] = Double.parseDouble(ulaz.readLine());
			System.out.println("h= ");
			h[i] = Double.parseDouble(ulaz.readLine());
			System.out.println("L= ");
			L[i] = Double.parseDouble(ulaz.readLine());
		}
		System.out.println("\tb\th\tL\tvitkodt");

		for (int i = 1; i <= m; i++) {
			double Imin = Math.pow(b[i], 3) * h[i] / 12;
			double f = b[i] * h[i];
			double imin = Math.sqrt(Imin / f);
			double vitkost = L[i] / imin;

			if (vitkost > 50)
				System.out.println("\t" + b[i] + "\t" + h[i] + "\t" + L[i] + "\t" + vitkost);
		}
	}

}
