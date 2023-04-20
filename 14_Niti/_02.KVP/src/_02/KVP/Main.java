package _02.KVP;

public class Main {
	//pokretanje nove niti
	
			//Novu nit pokrecete tako sto napravite instancu objektata tipaThread
			//To se moze uradit na nacin
			//1. implementacija fejsa Runnable  ***
			//2.  prosirivanje klase Thread
	
	//U main klasi>
	//Nakon kreriranje klase koja implementira interfes Runnable potrebno+// je napraviti instancu objekta tipa Thread
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementacija interfejsa Runnable
		
		A a = new A(); 
		
		//Oblik konstruktora
		//Thread(Runnable objekatNit, String imeNiti
	//objekatNit je instanca klase koja iplementira interfejs Runnable definise mjesto gdje apocinje nit
		
		//imeNiti - predstavlja ime nove niti koje mi zadajemo
		
		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		t1.start(); // metoda start() poziva metodu Run
		t2.start();
		t3.start();
	}

}
