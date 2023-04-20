package zoran.djurkovic;

import java.text.DecimalFormat;

public class Main {

static double funkcija(double x, double y) {
		
		double fOdX;
		
		if(x < y)
			
		     fOdX = Math.exp(x) + Math.cos(3 * y);
		
		   else if(x == y)
			   
		     fOdX = Math.sin(x);
		
		   else
			   
		     fOdX = 1  + Math.sqrt(Math.abs(x * y));
		
		return fOdX;
		}
	
	
		public static void main(String[] args) {
			
			
		DecimalFormat df = new DecimalFormat("#.##");
		
		
		System.out.println("\tX\tY\tF(X, Y)");
		System.out.print("\n");
		
		
		for(double x = 0.1; x <= 0.5; x += 0.1)
		   for(double y = 0.01; y <= 0.03; y += 0.01)
			   
			   
		System.out.println("\t"+ df.format(x) + "\t"+ df.format(y) + "\t"+ df.format(funkcija(x, y)));
		
		    }
		}
