package paket;

import java.text.DecimalFormat;

public class TestSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Suma s = new Suma(10);

		DecimalFormat df = new DecimalFormat("###,##0.00");

		System.out.println("Rezultat sumiranja prvih 10 brojeva je " + df.format(s.sumiratiDoN()));

		System.out.println(
				"Rezultat sumiranja sa uslovom prvih 10 brojeva unetih je " + df.format(s.sumiratiSaUslovom()));

		System.out.println("Rezultat dvostruke sume za uneto n = 10 je " + df.format(s.dvostrukaSuma()));

	}

}
