package p2;

public class SamePackage {

	SamePackage() {
		p1.Base b = new p1.Base();

		System.out.println("Konstruktor klase SamePackage");

		System.out.println("Konstruktor klase Base");
		// System.out.println("Base klasa nPri"+ b.nPri);
		// System.out.println("Base klase nDef" + b.nDef);
		// System.out.println("Konstruktor klase Base" + b.nPro);
	}

}
