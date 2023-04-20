
public class ObjekataKaoParametrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(10);// parametar ima vrednost 10
		Circle c2 = new Circle(c1);// c1 objekat koji jevec kreiran

		System.out.println("Povrsina kruga " + c2.area());

	}

}
