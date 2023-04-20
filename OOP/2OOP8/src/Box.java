
public class Box {

	private double width;
	private double height;
	private double dept;

	Box(double width, double height, double dept) {
		this.width = width;
		this.height = height;
		this.dept = dept;
	}

	double volume() {

		return width * height * dept;

	}

}
