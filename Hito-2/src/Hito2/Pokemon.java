package Hito2;

public class Pokemon {
	private String nombre, tipo;
	private int nivel, velocidad, experiencia, salud;
	
	public Pokemon (String nombrepokemon, String tipopokemon, int nivelpokemon, int velocidadpokemon, int experienciapokemon, int saludpokemon) {
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
	
	public int getNivel() {
		return nivel;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public int getExperiencia() {
		return experiencia;
	}
	
	public int getSalud() {
		return salud;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void setSalud(int salud) {
		this.salud = salud;
	}

}
