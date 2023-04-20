package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 1;
			System.out.println("a = " + a);
			int b = 10 / a;

			int c[] = { 1 }; // jedan od nacina inc. niza
			c[10] = 100;

		} catch (ArithmeticException e) {
			System.out.println("delenje nulom" + e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Nepostojeci indeks unutar niza" + e);

		}

		System.out.println("Nakon try/catch, catch bloka");

	}

}
