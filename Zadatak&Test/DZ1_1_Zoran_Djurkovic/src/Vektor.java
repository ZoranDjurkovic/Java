
public class Vektor {
	
	int a,b;
	
	Vektor(){
		
	}
	
	Vektor(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
		
	public int[] napraviVektorA(int a, int b) {
			
		int nizA [] = new int[(b - a) +1];
			
			for(int i = 1; i < nizA.length; i++) {
				nizA[i] =  b ++;
			}
			return nizA;
		}
		
	public	int[] napraviVektorB(int a, int b) {
			
			int nizB [] = new int[(b - a) +1];
				
				for(int i = 1; i < nizB.length; i++) {
					nizB[i] =  b ++;
				}
				return nizB;
			}
		
		
	


}
