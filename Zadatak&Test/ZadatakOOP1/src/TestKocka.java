
public class TestKocka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// izrada objekta klase kocka

		Kocka k = new Kocka(5.0);

		// Stampanje povrsine i zapremine kocke

		System.out.println("Povrsina kocke stranice a  = " + k.getStranica() + " iznosi: " + k.povrsina());
		System.out.println("Zapremina kocke za stranicu a = " + k.getStranica() + " iznosi " + k.zapremina());

	}

}
