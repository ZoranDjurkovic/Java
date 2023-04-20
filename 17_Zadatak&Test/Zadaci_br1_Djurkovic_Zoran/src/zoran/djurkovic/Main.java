package zoran.djurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	
	public static double f (double a, double b, double c) {
		return  a - b / Math.pow(c, 3)-(Math.pow(c,2 )*b)+(c * b)+a;
	}
	public static double g (double a, double b, double c) {
		return (a + b + Math.sin(a)) * Math.cos(c);
	}

	public static void main(String[] args) throws Exception{
	
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za a: ");
		double a = Double.parseDouble(ulaz.readLine());
		
		System.out.println("Unesite vrednost za b: ");
		double b = Double.parseDouble(ulaz.readLine());
		
		System.out.println("Unesite vrednost za c: ");
		double c = Double.parseDouble(ulaz.readLine());
		
		double zbir = f(a,b,c) + g(a,b,c);
		double razlika = f(a,b,c) - g(a,b,c);
		
		System.out.println("Zbir funkcija f i g je " +df.format(zbir));
		System.out.println("Razlika funkcija f i g je " + df.format(razlika));
	}

}
