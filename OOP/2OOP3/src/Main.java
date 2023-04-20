
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box();
		Box b2 = new Box();

		double vol;

		b1.width = 10;
		b1.height = 15;
		b1.dept = 20;

		b2.width = 5;
		b2.height = 6;
		b2.width = 7;

		vol = b1.width * b1.height + b1.dept;
		System.out.println(" Zapremina " + vol);

		vol = b2.width * b2.height + b2.dept;
		System.out.println(" Zapremina " + vol);
	}

}
