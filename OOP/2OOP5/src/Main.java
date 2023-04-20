
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box();// u trenutku kreiranja objekta,
		// pozvace se podrazumjevani konstruktor
		Box b2 = new Box();

		b1.initBox(10, 15, 20);
		b2.initBox(5, 6, 7);

		System.out.println("Zapremina " + b1.volume());
		System.out.println("Zapremina " + b2.volume());

	}

}
