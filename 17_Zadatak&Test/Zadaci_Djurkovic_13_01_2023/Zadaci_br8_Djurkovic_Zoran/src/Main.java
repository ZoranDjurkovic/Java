import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	
	public static double [] B0B1(double[] x, double[] f, int n) {
		
		double sum1 = 0,  sum2 = 0, sum3 = 0, sum4 = 0;
		double[] kof  =new double [5];
		
		
		
		double x1 = 1 ;
		
		for(int i = 1; i<= n; i++ ) {
			
			sum1 += Math.log(x[i]);
			sum2 += Math.log(f[i]);
			sum3 += Math.log(x[i]) * Math.log(f[i]);
			sum4 += Math.log(x[i]) * Math.log(x[i]);
		}
		
		kof [n] = (sum1 * sum2 - n * sum3) / (sum1 * sum1 - n * sum4);
		kof [n] = Math.pow(((sum2 - kof[n] * sum1)/n),2); 
		
		// druga polovina zadatatka Da li je opseg funkcije u intervalu xp>X0 i xk< xn
		
		
		f[n] = kof[n] * Math.pow(x[n],kof[n]);
		return kof;
	}

	public static void main(String[] args )throws Exception {
		// TODO Auto-generated method stub
		
		double[] x = new double[100];
		double[] f = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Unesite vrednost za n: ");      
		int n = Integer.parseInt(ulaz.readLine());
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". tačka ");
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("y[" + i + "] = ");
			f[i] = Double.parseDouble(ulaz.readLine());

			
			
			System.out.println("X = " + df.format(B0B1(x, f, n)[n]) + "\tb   Y = " + df.format(f));
	}

}
}
