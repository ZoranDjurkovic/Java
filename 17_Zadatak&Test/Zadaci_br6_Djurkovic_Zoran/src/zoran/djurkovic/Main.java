package zoran.djurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat();
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		double a = 1;
		double b = 1;
		
		System.out.println("Unesite Vrednost za n: ");
		double n = Double.parseDouble(ulaz.readLine());
		
		for(int i = 2; i<=n; i++) {
			
			a *= i;
			b *= (1 - 1/a);
			
		}
		
		System.out.println("| Unesena vrednost za "+n+", daje proizvod iznosa " + df.format(b)+" |");
		
		

	}

}
