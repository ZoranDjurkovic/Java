import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class while10b {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos vrednosti promenjivuh eps,x0 i z0

		System.out.println("Unesite vrednost za epsilon ");
		double eps = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za x0 ");
		double x0 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za y0 ");
		double y0 = Double.parseDouble(ulaz.readLine());

		// Iterativni postupak za odredjivanja resenja sistema jednacina

		double x1 = 0.5 * Math.sqrt(x0 * (3 * y0 - 1) + 1);
		double y1 = Math.sqrt((x0 + 3) / 2);

		do {
			x0 = x1;
			x1 = 0.5 * Math.sqrt(x0 * (3 * y0 - 1) + 1);
			y0 = y1;
			y1 = Math.sqrt((x0 + 3) / 2);
		} while (Math.abs(x1 - x0) > eps || Math.abs(y1 - y0) > eps);
		// Stampanje izlaznog rezultata

		System.out.println("Resenje sistema jednacina su x = " + df.format(x1) + " i y = " + df.format(y1));
	}

}
