package src;

public class Pokemon_Planta extends Pokemon implements IFormulasDanio{
    private double densidadEsporas;

    public Pokemon_Planta(String nombrepokemon, String tipopokemon, double nivelpokemon, double velocidadpokemon, double experienciapokemon, double saludpokemon, double densidadEsporas) {
        super(nombrepokemon, tipopokemon, nivelpokemon, velocidadpokemon, experienciapokemon, saludpokemon);
        this.densidadEsporas = densidadEsporas;
    }
    @Override
    public String toString() {
		return "Pokemon: " + nombre + " Tipo: " + tipo + " Velocidad: " + velocidad + " Experiencia: " + experiencia + " Salud: " + salud + " Densidad de Esporas: " + densidadEsporas;
	}

    @Override
    public void atacar(Pokemon pk) {
        System.out.println(nombre + " ataca a " + pk.getNombre());
        double daño = (getNivel() * FACTOR_NIVEL_PLANTA) + (densidadEsporas * FACTOR_DENSIDAD_ESPORAS);
        if(pk.getTipo() == "Agua"){
            daño *= MULTIPLICADOR_VENTAJA;
            System.out.println("Es muy efectivo");
        }
        else{
            daño *= MULTIPLICADOR_DESVENTAJA;
            System.out.println("No es muy efectivo");

        }
        System.out.println(nombre + " usa un ataque de planta causando " + daño + " puntos de daño");
        pk.setSalud(pk.getSalud() - daño);
    }
    
}
