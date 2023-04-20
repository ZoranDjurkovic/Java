package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bajt {

	public static void main(String[] args) throws Exception {

		double kb;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Velicina datoteke u kilobajtima");
		System.out.println("Velicina datoteke u bajtima " + ((kb = Double.parseDouble(ulaz.readLine())) * 1024));
	}

}
