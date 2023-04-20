
public class Circle {

	private double radius;

	Circle() { // konstruktor bez parametara
		radius = 0.0;
	}

	Circle(double radius) { // ima jedan parametar
		this.radius = radius;

	}

	Circle(Circle ob) { // ima objekat kao parametar
		radius = ob.radius; // ostupak inicijalizacije polja (atributa) objekta klase
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
