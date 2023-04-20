import java.text.DecimalFormat;

public class Primer17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b;

		DecimalFormat df = new DecimalFormat("###,###0.000");

		System.out.println("ta\tb\tcos(a)-cos(b)\t-2*(a+b)/2*sin(a-b)/2");

		for (a = 0.1; a <= 0.5; a += 0.1)
			for (b = 0.1; b <= 0.2; b += 0.1) {
				double p = Math.cos(a) - Math.cos(b);
				double q = -2 * Math.sin((a + b) / 2) * Math.sin((a - b) / 2);

				System.out.println("\t" + a + "\t" + b + "\t" + df.format(p) + "\t" + df.format(q));
			}

	}

}
