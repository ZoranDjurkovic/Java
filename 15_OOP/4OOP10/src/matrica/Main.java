package matrica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrica m1 = new Matrica(5, 4);

		System.out.println("Matrica ima " + m1.vrs());
		System.out.println("Broj kolana izznosi " + m1.kol());

		System.out.println(m1.postavi(1, 2, 3));

		System.out.println("Dohvati " + m1.dohvati(1, 2));

		System.out.println(m1.toString());
	}

}
