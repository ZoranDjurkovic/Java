package paket2;

import paket1.Knjiga;

public class TestKnjiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Knjiga k = new Knjiga();

		k.setNaslov("Na Drini Cuprija");
		k.setAutor("Ivo Andric");
		k.setOpis("Roman pripoveda o gradjenju mosta preko Drine u bosanskom mestu Visegrad");
		k.setCena("Cena");
		k.setIndikatorStanja(true);

		System.out.println(k.toString());
	}

}
