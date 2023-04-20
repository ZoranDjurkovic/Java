package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DvocifrenBroj {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int a, d, j;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dvocifrn broj unesi");
		a = (int) Double.parseDouble(ulaz.readLine());

		// System.out.println("Dvocifrn broj unesi");

		d = a / 10;
		j = a % 10;

		System.out.println("broj = " + a + "  " + " cifra jedinica = " + j + " cifra desetica je =  " + d);
	}

}
