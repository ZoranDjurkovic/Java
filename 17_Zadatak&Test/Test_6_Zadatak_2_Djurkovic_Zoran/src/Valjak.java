
public class Valjak {
	
	private double poluprecnik;
	private double visina;
	
	Valjak(){
		
	}
	
	Valjak(double poluprecnik, double visina){
		this.poluprecnik = poluprecnik;
		this.visina = visina;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		 this.poluprecnik = poluprecnik;
	}

	public double getVisina() {
		return visina;
	}

	public  void setVisina(double visina) {
		 this.visina = visina;
	}
	
	
	public double Zapremina () {
		return  (Math.pow(getPoluprecnik(), 2) * Math.PI) * getVisina();
	}

	
	public String toString() {
		return "Valjak  poluprecnika = " + getPoluprecnik()+ " i visine " + getVisina() + "je zapremina " + Zapremina();
	}

}
