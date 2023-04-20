package zoka.djurekoic;

public class Patike {
	
	private int velicina;
	
	public Patike(){
		
	}
	
	public Patike (int velicina) {
		
		this.velicina = velicina;
		
	}

	public int getVelicina() {
		return velicina;
	}

	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}

	
	public String toString() {
		return "Patike velicina je  " + velicina + " 44";
	}
	
	
	

}
