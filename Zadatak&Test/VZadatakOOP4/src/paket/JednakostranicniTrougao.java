package paket;

public class JednakostranicniTrougao {

	private double stranica;

	public JednakostranicniTrougao(double stranica) {
		this.stranica = stranica;
	}

	public void postaviStranicu(double stranica) {
		this.stranica = stranica;

	}

	double povrsina() {
		return (stranica * Math.sqrt(3)) / 4;
	}

	double obim() {
		return (3 * stranica);
	}
}
