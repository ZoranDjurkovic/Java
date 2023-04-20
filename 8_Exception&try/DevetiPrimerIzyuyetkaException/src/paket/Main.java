package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 1; // 0,1,2
			int b = 10 / a; // ovde je rizicna operacija
			System.out.println("a = " + a);

			try {
				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int c[] = { 1 };
					c[10] = 100;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// unutrasnji catch blok
				System.out.println("Greska sa indexom " + e);
			}

		} catch (ArithmeticException e) {
			// spoljasni catch blok
			System.out.println("Greska prilikom djeljenja " + e);
		}

	}

}
