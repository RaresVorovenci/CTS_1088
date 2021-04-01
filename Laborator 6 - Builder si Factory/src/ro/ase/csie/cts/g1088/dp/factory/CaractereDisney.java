package ro.ase.csie.cts.g1088.dp.factory;

public class CaractereDisney extends CaracterAbstract{

	String culoare; 
	

	public CaractereDisney(String culoare, String nume, boolean b) {
		this.nume = nume;
		this.culoare = culoare;
	}
	
	
	@Override
	public void alearga() {
		System.out.println("Alearga...");
		
	}

	@Override
	public void sare() {
		System.out.println("Sare...");
		
	}

	

}
