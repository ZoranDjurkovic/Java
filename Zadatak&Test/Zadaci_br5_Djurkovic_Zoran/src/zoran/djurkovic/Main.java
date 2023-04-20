package zoran.djurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws Exception {
		
		DecimalFormat df = new  DecimalFormat ();
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za n ");
	    int	n = Integer.parseInt(ulaz.readLine());
	    
	    System.out.println("Unesite vrednost za a ");
	    int	a = Integer.parseInt(ulaz.readLine());
	    
	    System.out.println("Unesite vrednost za epsilon ");
	    double	eps = Double.parseDouble(ulaz.readLine());
	    
	    double x0 = (a + n - 1) / n;
	    double x1 = ((n - 1) * x0 + a/Math.pow(x0, n-1))/n;
	    
	    while(Math.abs(x1-x0)>eps) {
	    	if(a>0)
	    	x0=x1;
	    	x1=((n-1)) * x0 + a / Math.pow(x0, n-1)/n;
	    	
	    	
	    }
	    		
	    System.out.println("Dobijena vrijednost je x = " + df.format(x1));	
	    		
	    		
	    		
		

	}


}
