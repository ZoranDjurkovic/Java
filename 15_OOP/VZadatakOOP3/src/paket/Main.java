package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monitor mon = new Monitor();

		mon.setMarka("Samsung");
		mon.setVelicinaEkrana(12);

		System.out.println("Podaci o monitoru su");
		System.out.println(mon.toString());

	}

}
