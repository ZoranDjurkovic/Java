package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lopta {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double r, P, V;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost poluprecnika ");

		r = Double.parseDouble(ulaz.readLine());

		System.out.println("Povrsina lopte je " + (Math.pow(r, 2) * Math.PI * 4));
		System.out.println("Zapremina lopte je " + (Math.pow(r, 3) * Math.PI * 4.0 / 3));

	}

}
