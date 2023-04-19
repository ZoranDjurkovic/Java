import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vjezba17 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double suma = 0, vrednostBoda;
		String[] ime = new String[20];
		double[] brojBodova = new double[20];
		double[] kredit = new double[20];
		double[] clanarina = new double[20];
		double[] licniDohodak = new double[20];
		int brojRadnika;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost boda");
		vrednostBoda = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite broj radnika");
		brojRadnika = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite podatkeo radnicima:ime,broj bodava, ratu kredita i clanarinu");
		for (int i = 1; i <= brojRadnika; i++) {
			System.out.println("Podaci za " + i + ". radnika");
			System.out.print("Ime ");
			ime[i] = ulaz.readLine();
			System.out.print("Broj bodova");
			brojBodova[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("Rata kredita");
			kredit[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("Clanarina");
			clanarina[i] = Double.parseDouble(ulaz.readLine());

			licniDohodak[i] = brojBodova[i] * vrednostBoda - kredit[i] - clanarina[i];
			suma += licniDohodak[i];
		}

		System.out.println("Ime\tBroj bodova\tKredit\tClanarina\tPlata");
		for (int i = 1; i <= brojRadnika; i++)
			System.out.println(
					ime[i] + "\t" + brojBodova[i] + "\t" + kredit[i] + "\t" + clanarina[i] + "\t" + licniDohodak[i]);

		System.out.println("=============================================================");
		System.out.println("Ukupno za isplatu: \t\t\t" + suma);

	}

}
