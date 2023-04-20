
public class Kanta extends Valjak {
	
	double popunjenostKante;
	
	Kanta(){
		
	}
	
	
    Kanta(double poluprecnik, double visina,double popunjenostKante){
    	super(poluprecnik, visina);
    	this.popunjenostKante = popunjenostKante;
    }


	public double getPopunjenostKante() {
		return popunjenostKante;
	}


	public void setPopunjenostKante(double popunjenostKante) {
		this.popunjenostKante = popunjenostKante;
	}
	
	double popunjenostKante(){
		
		
		return Zapremina() * (popunjenostKante/100);
	}


	
	

}
