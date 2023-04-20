package paket;

public class finnalyBlockwithException {

	static void procA() {
		try {
			System.out.println("insideprocA");
			/* mi bacamo izuzetak */ throw new RuntimeException("demo"); // throws je u zaglavlju metode
			// throw koriste se za bacanje izuzetka unutar u telu metode
		} finally {// finnaly blok se izvrsava bez obzira da li je ili nije doislo do izuzetka
			System.out.println("rocA");
		}
	}

	static void procB() {
		try {
			System.out.println("procB");
			return; // break, continue, System.exit(0)
		} finally {
			System.out.println("procBs finnaly");
		}
	}

	static void procC() {
		try {
			System.out.println("procC");

		} finally {
			System.out.println("procCs finnaly");
		}
	}
}
