package paket1;

import java.util.Scanner;

import paket.BankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite novi iznos Vase uplate na racun ");

		double uplata = sc.nextDouble();

		BankAccount ba = new BankAccount(uplata);

		System.out.println(ba.toString());

	}

}
