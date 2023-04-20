package matrica;

public class Matrica {

	private double[][] matr;

	public Matrica(int vrs, int kol) {
		matr = new double[vrs][kol];
	}

	public double vrs() {
		return matr.length; // lenght = osobina
	}

	public double kol() {
		return matr[0].length;
	}

	public Matrica postavi(int v, int k, double vr) {
		// if (v > 0 || k > 0)

		matr[v][k] = vr;
		return this;
	}

	public double dohvati(int v, int k) {
		return matr[v][k];
	}

	public String toString() {
		String s = "";
		for (int v = 0; v < matr.length; v++) {
			for (int k = 0; k < matr[0].length; k++) {
				System.out.print(matr[v][k] + '\n');
				s = s + '\n';
			}
		}
		return s;
	}

}
