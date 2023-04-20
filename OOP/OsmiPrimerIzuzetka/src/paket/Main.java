package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 0;
			int b = 10 / a;
		} catch (ArithmeticException e) {
			System.out.println("Izuzetak");
	//	} catch (ArithmeticException e) {
		//	System.out.println("Izuzetak");
		//}
		// Ukoliko postoji vise cath blokova ciji tip parametra odgova tipu
		// bacenog izuzetka izvrsava se samo prvi takav catch blok
		// Greska je navesti dva catch bloka sa istim tipom parametra
	}

}
