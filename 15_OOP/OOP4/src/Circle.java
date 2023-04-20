
public class Circle {

	private double poluprecnik;

	Circle() {
		poluprecnik = 10.0;
	}

// poluprecnik ima vrdnost koja je postavljena u konstruktoru prilikom kreiranja objekta
	public double area() {
		return 3.14 * poluprecnik * poluprecnik;
	}
}