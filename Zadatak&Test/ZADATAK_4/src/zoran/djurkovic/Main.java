package zoran.djurkovic;



public class Main {

	public static void main(String[] args) {
	
		
		
      int [] niz = {72,25,36,9,78,91,54,};

      int p=0;
      int r=0;
      
      for (int i=0; i <= niz.length; i++) {
    	  if( niz[i]%2 == 0) {
    		  p=p+1;
    	  }  
       
      
    	   if(niz[i]%2 !=0) {       	
    		  r=r+1;
    	  
    	   }
       System.out.println("\nBroj parnih brojeva u nizu je  " + p);
      
      System.out.println("Broj neparnih brojeva u nizu je " + r);
	}
	}
}
