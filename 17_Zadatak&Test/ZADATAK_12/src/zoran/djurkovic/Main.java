package zoran.djurkovic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;		
		if (n == 0 || n==1) {
			
		}
		
		int [] niz = {1,2,3,2,1,4,5,6,5,7};
		
		int []priv = new int[n];
		
		int j = 0;
		
		for (int i = 0; i < n-1; i++) {
			if(niz[i] != niz[i]) {
				priv[j++]=niz[i];
			}
			
		}
		 priv[j++] = niz[n-1];
		 
		 for (int i = 0; i < j; i++) {
			 
			 niz[i] = priv[i];
			
		}
		
		 for (int i = 0; i <j ; i++) {
			 System.out.println(niz[i] + " ");
		}

		
	}

}
