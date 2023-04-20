package _03.KVP;

//Nit se i moze napraviti kada klasu Thread prosirete novom nasledjenom klasom
//a zatim apravite instancu te klase

//Nova potklasa mora da redefinise metodu run()

public class A extends Thread{
	
	public A(String s) {
		
		super(s); // poziva se konstruktor Thread sledeceg oblika > public Thread(Strin i)
		
		
	}
	
	public void run() {
		for (int i=1; i <= 10; i++) {
			System.out.println(getName());
		}
	}

}
