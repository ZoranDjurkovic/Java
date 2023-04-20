package zoran.djurkovic;

public class Main {

	public static void main(String[] args) {
		Djak dj = new Djak("Mika", "26-01-1999","ul.Desna","Osnovna skola","7. razred");
		
		Zaposleni zp = new Zaposleni("Zika","27-01-200","ul.Leva","doo.Macak Loznica","mrt") ;
		
		System.out.println("Ime djaka - " + dj.getIme());
		System.out.println("Datum rodjenja djaka - " + dj.getDatumRodjenja());
		System.out.println("Ulicaa stanovanja djaka - " + dj.getAdresa());
		System.out.println("Skola u koju ide djak - " + dj.getSkola());
		System.out.println("Razred u koji ide djak - " + dj.getRazred());
		System.out.println("\n");
		System.out.println("Ime zaposlenog - " + zp.getIme());
		System.out.println("Datum rodjenja zaposlenog - " + zp.getDatumRodjenja());
		System.out.println("Ulicaa stanovanja zaposlenog - " + zp.getAdresa());
		System.out.println("Firma u kojoj radi zaposleni - " + zp.getFirma());
		System.out.println("Odeljenje u kojem radi zaposleni  - " + zp.getDioFirme());
		
		

	}

}
