package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PromenaRedosleda os = (str) ->  {
			String rezultat = "";
			for (int i = str.length()-1; i >= 0; i--)
				rezultat += str.charAt(i);
			return rezultat;
		};
		
		System.out.println("12345 - "+ os.OkreniString("12345") );
		System.out.println("Java obrnuto - "+ os.OkreniString("Java") );

	}

}
