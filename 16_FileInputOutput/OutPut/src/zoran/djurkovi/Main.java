package zoran.djurkovi;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		JOptionPane.showMessageDialog(null,"Promena " + a + " " + b);
	}

}
