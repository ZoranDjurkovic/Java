package _04.KVP;

public class A extends Thread {
	
		
		public A(String s) {
			
			super(s); 
			
			
		}
		
		public void run() {
			for (int i=1; i <= 10; i++) {
				System.out.println("Poziv A");
			}
		}

}
