package paket;

public class BankAccount {

	private double racun1;

	private double racun1a = 500;

	BankAccount() {
		racun1 = 0;
	}

	public BankAccount(double racun1) {
		this.racun1 = racun1;
	}

	public double getRacun1() {
		return racun1;
	}

	public double noviZbir() {
		return racun1 + racun1a;
	}

	public double getRacun1a() {
		return racun1a;
	}

	public void setRacun1a(double racun1a) {
		this.racun1a = racun1a;
	}

	public String toString() {
		return " Trenutni iznos na racunu je " + "\n" + racun1a + "\n Iznos uplate:" + "\n" + racun1
				+ "\n Vase trenutno stanje je " + noviZbir();
	}

}
