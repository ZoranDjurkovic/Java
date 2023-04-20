package zoran.djurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		double x, y;
		
		BufferedReader ulaz = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za x - ");
		x = Double.parseDouble(ulaz.readLine());
		
		if( x < 5.0) 
			
		 y = Math.pow((x-3.0),2);
		 
		 else if(x < 8.0) 
			 
			y = x + 2.0;
		
		 else  
		 
			y = x - 1.0;
		
			System.out.println("Za uneseno X = " + x + " dobije se da je Y = " + y );
	}

}
