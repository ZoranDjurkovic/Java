package gTry_1;

public class TestAutomobila {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Izrada objekta klase Automobili

		Automobili auto = new Automobili();

		auto.unetiNaziAvutomobila();
		auto.unetiProizvodjacaAutomobila();
		auto.unetiGodisteAutomobila();
		auto.unetiPotrosnjuAutomobila();

		// stampanje podataka o automobilu

		System.out.println("\nUneti podaci o automobilu su ");
		System.out.println(auto.toString());

	}

}
