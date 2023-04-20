import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Osoba o1 = new Osoba();

		System.out.println("Unesite Ime ");
		o1.ime = sc.nextLine();

		System.out.println("Unesite datum nrodjenja");
		o1.datumRodjenja = sc.nextLine();

		System.out.println("Unesite adresu stanovanja");
		o1.adresaStanovanja = sc.nextLine();

		System.out.println(o1.ispisi());
		sc.close();
	}

}
