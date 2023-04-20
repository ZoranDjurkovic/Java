
public class Box {

	private double width;
	private double height;
	private double dept;

	Box() {
		width = 1;
		height = 1;
		dept = 1;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		dept = d;
	}

	Box(double len) {
		width = height = dept = len;

	}

	Box(Box b) {

		width = b.width;
		height = b.height;
		dept = b.dept;

	}

	double volume() {

		return width * height * dept;

	}

}
