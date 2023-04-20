package paket;

public class TestBitOperatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// poziv metoda klase BitOperatori

		System.out.println("Rezultat binarnog operatora i brojeva 3 i 5 je " + BitOperatori.binarnoI(3, 5));
		System.out.println("Rezultat binarnog operatora ili brojeva 3 i 5 je " + BitOperatori.binarnoILI(3, 5));
		System.out.println(
				"Rezultat binarnog operatora iskljucivo ili brojeva 3 i 5 je " + BitOperatori.iskljucivaoILI(3, 5));
		System.out.println("Rezultat pomeranja operatora ulevo za brojeve 3 za 2 je " + BitOperatori.pomeriUlevo(3, 2));
		System.out
				.println("Rezultat pomeranja operatora udesno za brojeve 5 i 2 je " + BitOperatori.pomeriUdesno(5, 2));
		System.out.println("Rezultatoperatora komplement broja 5 je " + BitOperatori.komplement(5));

	}

}
