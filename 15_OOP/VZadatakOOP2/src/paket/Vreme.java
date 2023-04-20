package paket;

public class Vreme {

	public int sat;
	public int minut;

	public Vreme(int sat, int minut) {
		this.sat = 12;
		this.minut = 23;
	}

	public void postaviVreme(int sat, int minut) {
		this.sat = sat;
		this.minut = minut;

	}

	public void stampaj() {
		System.out.println("sati  i minuta je " + sat + ":" + minut);
	}

}
