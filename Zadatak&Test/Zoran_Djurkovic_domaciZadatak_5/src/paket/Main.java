package paket;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	   Scanner sc = new Scanner(System.in);
		
       LinkedList<Integer> celobrojnaLista = new LinkedList<>(); 
      
         
        System.out.println("Unesite vrednosati elemenata u listu");
        int broj = sc.nextInt(); 
        
        while(broj>0) { 
        	
        celobrojnaLista.add(sc.nextInt());
         
        
        System.out.println("LinkedLista izgleda ovako " + celobrojnaLista);
        }
        sc.close();
       
    }


	}


