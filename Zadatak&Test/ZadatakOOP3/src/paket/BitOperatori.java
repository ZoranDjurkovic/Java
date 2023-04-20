package paket;

public class BitOperatori {

	// Metoda za primenu operatora binarno I
	static int binarnoI(int x, int y) {
		return x & y;

	}

	// Metoda za primenu operatora ILI
	static int binarnoILI(int x, int y) {
		return x | y;
	}

	// Metoda za primenu operatora iskljucivo ILI

	static int iskljucivaoILI(int x, int y) {
		return x ^ y;
	}

	// Metoda za primenu operatora pomeri ulevo

	static int pomeriUlevo(int x, int y) {
		return x << y;
	}

	// Metoda za primenu operatora pomeri udesno

	static int pomeriUdesno(int x, int y) {
		return x >> y;
	}

	// Metoda za primenu operatora komplement celog broja
	static int komplement(int x) {
		return ~x;
	}

}
