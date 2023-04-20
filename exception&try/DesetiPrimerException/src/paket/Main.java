package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finnalyBlockwithException fbwe = new finnalyBlockwithException();

		try {
			fbwe.procA();

		} catch (Exception e) {
			System.out.println("Exception uhvacen");
		}
		fbwe.procB();
		fbwe.procC();
	}

}
