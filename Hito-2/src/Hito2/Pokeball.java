package Hito2;

public class Pokeball {
	protected int integridad;
	protected double probabilidad;
	
	// constructor 
	public Pokeball(int integridad, double probabilidad) {
		this.integridad = integridad;
		this.probabilidad = probabilidad;
	}
	
	public int getIntegridad() {
		return integridad;
	}


	public void setIntegridad(int integridad) {
		this.integridad = integridad;
	}


	public double getProbabilidad() {
		return probabilidad;
	}


	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}


	public String toString() {
		return "Usando la Pokeball probabilidad de captura: " + getProbabilidad() + "%  |  integridad: " + getIntegridad();
	}

	public boolean Captura(Pokemon pk){
		System.out.println(toString());	
		integridad -= 4;
		if(probabilidad >= Math.random()*100){
			System.out.println("¡Captura exitosa! " + pk.getNombre() +" ahora es tuyo.");
			return true;
		}
		System.out.println("La captura de " + pk.getNombre() +" ha fallado.");
		return false;
	}

}

class Superball extends Pokeball{
	int racha = 0;
	public Superball(int integridad, int probabilidad){
		super(integridad, probabilidad);
	}
	public int getRacha() {
		return racha;
	}
	public void setRacha(int racha) {
		this.racha = racha;
	}
	@Override
	public String toString() {
		return "Usando la Superball probabilidad de captura: " + getProbabilidad() + "%  |  integridad: " + getIntegridad() + " | racha: " + getRacha();
	}

	@Override
	public boolean Captura(Pokemon pk){
		System.out.println(toString());		
		integridad -= 4;
		if(probabilidad >= Math.random()*100){
			System.out.println("¡Captura exitosa! " + pk.getNombre() +" ahora es tuyo.");
			return true;
		}
			racha += 1;
		probabilidad += 10;
		System.out.println("La captura de " + pk.getNombre() +" ha fallado.");
		return false;
	}


}


class Ultraball extends Pokeball{
	double potencia = 0;
	public Ultraball(int integridad, int probabilidad){
		super(integridad, probabilidad);
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "Usando la Ultraball probabilidad de captura: " + getProbabilidad() + "%  |  integridad: " + getIntegridad() + " | potencia: " + getPotencia();
	}
	@Override 
	public boolean Captura(Pokemon pk){
		System.out.println(toString());
		integridad -= 4;
		if(probabilidad >= Math.random()*100 || potencia == 0.4){
			System.out.println("¡Captura exitosa! " + pk.getNombre() +" ahora es tuyo.");
			return true;
		}
		potencia += 0.2;
		System.out.println("La captura de " + pk.getNombre() +" ha fallado.");
		return false;
	}
}

class Masterball extends Pokeball{
	private double estabilidad;
	private double dmg;
	
	public Masterball(int integridad, int probabilidad, int estabilidad){
		super(integridad, probabilidad);
		this.integridad = 4;
		this.estabilidad = estabilidad;
	}
	
	public double getEstabilidad() {
		return estabilidad;
	}
	
	public void setEstabilidad(double estabilidad) {
		this.estabilidad = estabilidad;
	}
	
	@Override
	public String toString() {
		return "Usando la Masterball probabilidad de captura: " + getProbabilidad() + "%  |  estabilidad: " + getEstabilidad();
	}
	@Override
	public boolean Captura(Pokemon pk){
		System.out.println(toString());
		integridad -= 4;
		dmg  = pk.getSalud()*(1 - estabilidad/100);
		pk.setSalud((int)(pk.getSalud() - dmg));
		System.out.println("¡Captura exitosa! " + pk.getNombre() +" ahora es tuyo.");
		return true;
	}

}
