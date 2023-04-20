
public class Box {
	private double width;
	private double height;
	private double dept;

	void initBox(double w, double h, double d) {

		width = w;
		height = h;
		dept = d;

	}

	double volume() {

		return (width * height) + dept;

	}
}
