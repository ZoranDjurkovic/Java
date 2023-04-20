
public class Tacka {

	private double x;
	private double y;

	// konstruktor
	Tacka(double x, double y) {
		this.x = x;
		this.y = y;

	}

	// geter uzima dohvata vrednost za koordinatu x
	public double getX() {
		return this.x;
	}

	// geter uzima dohvata vrednost za koordinatu y
	public double getY() {
		return this.y;
	}

	public String ispisi() {
		return "(" + x + "," + y + ")";

	}
}
