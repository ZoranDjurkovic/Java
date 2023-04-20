package _01.KVP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prilikom pokretanja java programa jedna programska nit odma pocin je da se iz\vrsava
		//To je glavna ili inicijalna nit
		
		//Upravljanje glavnom niti radi se preko objekta tipa Thread, pozivom metode currentThread() klase Thread
		
		Thread t1 = Thread.currentThread();
		
		System.out.println("Trenutna nit  -> " + t1);
		
		//getName() -- vraca ime niti
		
		System.out.println("Naziv niti " + Thread.currentThread().getName());
		
		// getPriority() - - vraca prioritet niti
		System.out.println("Priorite niti " +Thread.currentThread().getPriority());
  		
		 //[ime niti, prioritet, ime grupe kojoj pripada nit]
		//podrazumevano ime glavne niti je main, njen prioritet 5 sto je takodje podrazumevana vrednost
		// treci parametar main je ime grupe niti   kojoj ta nit pripada,
		//grupa niti je struktura podataka koja upravlja STANJEM KOLEKCIJE NITI kao celinom

	}

}
