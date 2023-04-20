package zoran.djurkovic;
import java.io.FileInputStream;
public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("ispis.txt");
		
		System.out.print("\n\nSadrzaj fajla ispis.txt je >  " );
		
		
			int ch;
		while((ch = fis.read()) != -1) {
			System.out.print((char)ch);
			
		}
		fis.close();



}

}
