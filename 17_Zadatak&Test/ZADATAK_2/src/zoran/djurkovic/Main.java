package zoran.djurkovic;


import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random proiz = new Random();
		
		
		
		for(int i = 1; i <=5;i++) {
			
			
			System.out.println( i + ". proizvoljni celobrojni broj > " + proiz.nextInt() + " < ");
		}
		}
	}


