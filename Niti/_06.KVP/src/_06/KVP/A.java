package _06.KVP;

public class A extends Thread{
	
	public void run() {
		int i = 1;
		while(i <= 10){
			System.out.println("i : " + i);
			//sleep(vrednostUMilisekundama) - privremeno zaustalja tj suspenduje izvrsavanje niti
			// argument etode sleep je interval u milisekundama
			// metoda sleep u klasi Thread moze a izaoza izuzetak InterruptedException
			//desi ce izuzetak ukoliko neka druga niti pozeli da prekine ovu suspendovanu nit
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				
			      System.out.println("Niz je prekinuta");
			}
			i++;
		}
	
	}

}
