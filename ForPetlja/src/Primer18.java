import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer18 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double x, y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1; i <= 5; i++) {

			System.out.println("Unesite " + i + ". vrednosta za x -  ");
			x = Double.parseDouble(ulaz.readLine());

			if (x < 2)
				y = x;
			else if (x < 3)
				y = 2.0;
			else
				y = x - 1;

			System.out.println("Za uneto X = " + x + " dobija se Y = " + y);

		}

	}

}
