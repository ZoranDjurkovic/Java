import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		double suma = -0;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("unesite vrednost za n ");
		int n = Integer.parseInt(ulaz.readLine());

		for (int i = 1; i <= n; i++)
			suma += (double) i / (i + 1); // suma =suma + (double) i/(i+1)

		System.out.println("Dobijena vrednost sume je " + suma);

	}

}
