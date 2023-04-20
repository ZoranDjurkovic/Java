package zoran.djurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		int  [] a = new int [1000];
		int [] b =new int [1000];
 		System.out.println("Unesite broj elemenata n ");
		int n = Integer.parseInt(ulaz.readLine());
		
		for(int i = 1; i<=n ; i++) {
			System.out.println("a[ " +i+"] = ");
			a[i] = Integer.parseInt(ulaz.readLine());
		}
		
		for(int i = 1; i<=n ; i++) {
		System.out.println("a[ " +i+"] = ");
		a[2*n+1-a[i]] = Integer.parseInt(ulaz.readLine());
		}
		System.out.print("[b] = ");
		for (int i=1;i<=n; i++) {
		b[i] = (a[i] + a[2*n+1-a[i]])/2;
		
		System.out.print(b[i] + " ");
		}
		
	}

}
