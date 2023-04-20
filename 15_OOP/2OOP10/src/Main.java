import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ime knjige");
		String ulazImeKnjiga = ulaz.nextLine();
		System.out.println("Unesite broj strana");
		double ulazBrojStrana = ulaz.nextDouble();

		Knjiga k1 = new Knjiga(ulazImeKnjiga, ulazBrojStrana);

		k1.prikaz();
		ulaz.close();
	}

}
