package paket;

public class TestNjutn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Poziv metoda klase Njutn

		if (Njutn.faktorijel(5) == -1)
			System.out.println(" Greska pri unosu vrednosti za n! ");
		else
			System.out.println("Faktorijel broja 5 je " + Njutn.faktorijel(5));

		if (Njutn.binomniKoeficijent(5, 2) == -1)
			System.out.println("Greska pri unosu vrednosti n i k");
		else
			System.out.println("Binomni koieficijent za n = 5, k = 2 je " + Njutn.binomniKoeficijent(5, 2));

		if (Njutn.binomnaFormula(5, 3, 4) == -1)
			System.out.println(" Greska pri unosu vrednosti za n ");
		else
			System.out.println(" Binomna formula za n = 5, a = 3, b = 4 je " + Njutn.binomnaFormula(5, 3, 4));

	}

}
