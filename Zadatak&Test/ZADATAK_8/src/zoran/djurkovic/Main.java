package zoran.djurkovic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite neki broj ");
        int broj = ulaz.nextInt();
        int c;
        int b =0;
        do {
            c = broj % 10;         
            broj = broj / 10;      
            System.out.print(" > " + c +" < ");
            b = b + c;
            
        } while (broj > 0);
        
        System.out.println(" = Suma cifara  unesenog broja je " + b);
       ulaz.close();
	}

}
