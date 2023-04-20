
public class Osnovna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Krug k1 = new Krug(20.0);
		calcArea(k1);

	}

	// k1 vs k
	public static void calcArea(Krug k) {
		System.out.print(k.area());
	}

}
