package _05.KVP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		A a = new A();
		B b = new B();
		
		// Kada odredjenoj niti zelite da dodate prioritet izvrsavanja, pozovite metodu setPririty koji je clan klase Thread

		//void setPriority(nivo)
		
		//Parametrom "nivo" zadajevo nivo prioriteta niit za koju je metoda pozvana
		//vrednost mora biti u opsegu MIN_PROROTY i MAX_PRIORITY
		// avrednost tih konstanti je izmedju 1 i 10
		//podrazumevana vrednost iznosi 5, a moze se zadati preko NORM_PRIORITY
		
		a.setPriority(Thread.MAX_PRIORITY -7);// 1 >6
		b.setPriority(Thread.MIN_PRIORITY +5);//10 > 3
		
		a.start();
		b.start();
		
		// 1..10
		
		System.out.println("Kraj glavne niti");
		
		
	}

}
