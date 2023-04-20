package paket;

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MojaKlasa mk = new MojaKlasa(10, 5);

		System.out.println("Vrednost a = " + mk.getA() + " , a za b = " + mk.getB());

		mk.reset();

		System.out.println("Vrednost a = " + mk.getA() + " , a  za b = " + mk.getB());

	}

}
