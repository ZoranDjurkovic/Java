package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primjena funkcionalnog interfejsa i lam,bda izraza
		
		NegativanBroj nb = (n) -> (n < 0);
		
		if(nb.isNegativan(-5)) {
			System.out.print("Broj je negativan");
		}else {
			System.out.println("Broj je pozitivan");
		}

	}

}
