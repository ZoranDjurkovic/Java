package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	TestiraBroj paranBroj = /* Ovde dolazi lambda izraz */
		
		// levastarna lambda izraza () -> lambda desna strana lambda izraza telo
	//	 double nekaMetoda() {return 12345};
		
		TestiraBroj paranBroj =  (n) -> (n % 2) == 0;
		
		if (paranBroj.test(11)) {
			System.out.println("Broj  je paran broj");
		}else
		{
			System.out.println("Broj nije paran");
		}
}  
}