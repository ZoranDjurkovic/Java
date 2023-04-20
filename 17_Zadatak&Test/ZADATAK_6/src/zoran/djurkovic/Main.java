package zoran.djurkovic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner ulaz = new Scanner(System.in);
		 System.out.println("Unesite broj ");
		 int decimalniBroj = ulaz.nextInt();
		 
         int bin [] = new int [50];
         
         int ii = 0;
         
         while( decimalniBroj > 0) {
        	 
        	 bin [ii++] = decimalniBroj % 2;
        	 
        	 decimalniBroj = decimalniBroj / 2;
        	 
         }
         System.out.println("Uneseni decimalni broj u binarnom obliku = " );
         for (int i= ii-1;i>0; i--) {
        	 
        	 System.out.print( bin[i]);
        	 
         }
         System.out.print("");
         ulaz.close();
	}

}
