
public class Valjak {

	private double poluprecnik;
	private double visina;

	Valjak(double poluprecnik, double visina) {
		this.poluprecnik = poluprecnik;
		this.visina = visina;
	}

	Valjak() {
		poluprecnik = 1;
		visina = 1;

	}

	public double getVisina() {
		return this.visina;
	}

	public double getPoluprecnik() {
		return this.poluprecnik;
	}

	public double Visina() {
		return poluprecnik * poluprecnik * 3.14 * visina;

	}

	public String opisValjka() {
		return "Valjak je valjkast";
	}

}
