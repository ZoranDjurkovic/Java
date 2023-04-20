package paket;

public class TestiranjeAritmetickeOperacije {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Poziv metoda klase AritmetickeOperacije

		System.out.println(" Rezultat sabiranja brojeva 1 i 3 je: " + AritmetickeOperacije.saberi(1, 3));
		System.out.println(" Rezultat oduzimanja brojeva 18 i 2 je: " + AritmetickeOperacije.oduzmi(18, 2));
		System.out.println(" Rezultat mnozenja brojeva 5 i 6 je: " + AritmetickeOperacije.mnozenje(5, 6));
		System.out.println(" Rezultat mnozenja brojeva 1.4 i 2.5 je: " + AritmetickeOperacije.mnozenje(1.4, 2.5));
		System.out.println(" Rezultat dijeljenja dva broja 5.0 i 2.5 je: " + AritmetickeOperacije.podeli(5.0, 2.5));
		System.out.println(" Rezultat dijeljenja dva broja 10 i 3 je: " + AritmetickeOperacije.podeliCelobrojno(10, 3));
		System.out.println(" Rezultat operacije modula brojeva 10 i 3 je " + AritmetickeOperacije.nadjiModul(10, 3));

	}

}
