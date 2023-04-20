package paket;

public class A <T>{ //Genericka klasa. Ovde je T parametar tipa koji ce biti zamjenjen stvarnim tipom kada se napravi objekat tipa A
	
	T ob;    // int ob
	
	A(T o){
		ob = o;
	}
	
	public void setOb(T ob)
	{
		this.ob = ob;
	}
	
	public T getOb () {
		return ob;
	}
	
	void prikaziTip  () {
		System.out.println("Tip T je " + ob.getClass().getName());
	}

}
