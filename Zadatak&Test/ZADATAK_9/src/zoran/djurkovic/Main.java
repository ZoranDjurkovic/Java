package zoran.djurkovic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner ulaz=new Scanner(System.in); 
		   
		 String tekst;
		 int  p =0; 
		 
		System.out.println("Unesite tekst >   ");
		
		tekst=ulaz.nextLine();
         
		ulaz.close();
		
		for(int i=0; i<=tekst.length(); i++){
			
		   char ch = tekst.charAt(i);
		
		        if(ch==' '){
		        p++;
		    }
		}

		System.out.println("Ukupno bijelih polja "+ p);
		}
		
		

	

}
