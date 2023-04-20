package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProveraDeljivosti del = (n, m) -> (n % m == 0);
		
		if (del.test(10,2)) {
			System.out.println("Brojevi su deljivi");
		}else
		{
			System.out.println("Brojevi nisu deljivi");
		}

	}

}
