package _03.KVP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A("Nit1");
		A a2 = new A("Nit2");
		A a3 = new A("Nit3");
		
		a1.start();
		a2.start();
		a3.start(); // zapocinje izvrsavanje niti pozivanjemnjene metode run()

	}

}
