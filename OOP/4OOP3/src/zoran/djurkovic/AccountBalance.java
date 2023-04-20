package zoran.djurkovic;

public class AccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Balance current[] = new Balance[3];

		current[0] = new Balance("Mika", 123.45);
		current[1] = new Balance("Yika", 345.45);
		current[2] = new Balance("Ljubivoje", -123.65);
		// current[3] = new Balance("Mika", 123.45);

		for (int i = 0; i < 3; i++) {
			current[i].show();
		}

	}

}
