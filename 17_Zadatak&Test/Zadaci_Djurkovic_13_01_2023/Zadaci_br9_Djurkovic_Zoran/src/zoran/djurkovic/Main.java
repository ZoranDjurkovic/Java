package zoran.djurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub+
		

       
BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za n ");
	    
	    
 
        int F0 = 0;
        int F1 = 1;
        int G0 = 0;
        int G1 = 1;
        int	n = Integer.parseInt(ulaz.readLine());
 
        System.out.println("F0: " + F0);
        System.out.println("F1: " + F1);
        System.out.println("G0: " + G0);
        System.out.println("G1: " + G1);
 
        for (int i = 2; i <= n; i++) {
            int F2 = F1 * G1 + 3 * i - 1;
            F0 = F1;
            F1 = F2;
            int G2 = i * i * F1 + 2 * G1;
            G0 = G1;
            G1 = G2;
 
            System.out.println("F" + i + ": " + F2);
            System.out.println("G" + i + ": " + G2);
        }
    }
}


