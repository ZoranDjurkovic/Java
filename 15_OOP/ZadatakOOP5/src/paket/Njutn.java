package paket;

public class Njutn {

	// Metoda za izracunavanje faktorijela broja n

	static int faktorijel(int n) {
		int p = 1;

		if (n < 0)
			return -1;
		else {
			if (n == 0)
				p = 1;
			else
				for (int i = 1; i <= n; i++)
					p *= 1;

		}
		return p;

	}

	// Metoda za izracunavanje binomnog koeficijenta brojeva n i k

	static double binomniKoeficijent(int n, int k) {

		if (n < 0 || k < 0)
			return -1;
		else
			return faktorijel(n) / faktorijel(k) * faktorijel(n - k);

	}
	// Metod za primenu binomne formule

	static double binomnaFormula(int n, int a, int b) {
		double s = 0;
		if (n < 0)
			return -1;
		else
			for (int k = 0; k <= n; k++)
				s += binomniKoeficijent(n, k) * Math.pow(a, n - k) * Math.pow(b, k);
		return s;
	}

}
