package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
NegativanBroj nb = (n) -> (n < 0);        //Ovaj prvi zadatak smo odradili na casu.
		
		if(nb.isNegativan(-5)) {
			System.out.print("Broj je negativan");
		}else {
			System.out.println("Broj je pozitivan");
		}

	}

}
