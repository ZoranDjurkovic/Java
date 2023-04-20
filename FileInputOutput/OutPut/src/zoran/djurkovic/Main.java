package zoran.djurkovic;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException {
		

		
		FileInputStream fis = new FileInputStream("ispis.txt");
		
		System.out.println("Sadrzaj fajla " );
		
		// read() cita jedan po jedan bajt  iz datoteke i vraca ga kao celobrojnu vrednost
		//Kada stigne doo kraja metoda read() vraca vrednost -1
		
		int ch;
		while((ch = fis.read()) != -1) {
			System.out.print((char)ch);
			
		}
		fis.close();
	}

}
