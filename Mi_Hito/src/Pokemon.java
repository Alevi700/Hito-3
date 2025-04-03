package src;


public abstract class Pokemon {
	public String nombre, tipo;
	public double nivel, velocidad, experiencia, salud;
	
	public Pokemon (String nombrepokemon, String tipopokemon, double nivelpokemon, double velocidadpokemon, double experienciapokemon, double saludpokemon) {
		nombre = nombrepokemon;
		tipo = tipopokemon;
		nivel = nivelpokemon;
		velocidad = velocidadpokemon;
		experiencia = experienciapokemon;
		salud = saludpokemon;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public String toString() {
		return "Pokemon: " + nombre + " Tipo: " + tipo + " Velocidad: " + velocidad + " Experiencia: " + experiencia + " Salud: " + salud;
	}
	
	public double getNivel() {
		return nivel;
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public double getExperiencia() {
		return experiencia;
	}
	
	public double getSalud() {
		return salud;
	}
	
	public void setNivel(double nivel) {
		this.nivel = nivel;
	}
	
	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}
	
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public void setSalud(double salud) {
		this.salud = salud;
	}
	public abstract void atacar(Pokemon pk);

}


