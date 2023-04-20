package paket;

public class MojaKlasa {

	int a;
	int b;

	public MojaKlasa(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setAb(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void reset() {
		a = 0;
		b = 0;
	}

}
