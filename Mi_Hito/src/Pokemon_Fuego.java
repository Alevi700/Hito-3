package src;

public class Pokemon_Fuego extends Pokemon implements IFormulasDanio{
    private double temperaturaLlama;

    public Pokemon_Fuego(String nombrepokemon, String tipopokemon, double nivelpokemon, double velocidadpokemon, double experienciapokemon, double saludpokemon, double temperaturaLlama) {
        super(nombrepokemon, tipopokemon, nivelpokemon, velocidadpokemon, experienciapokemon, saludpokemon);
        this.temperaturaLlama = temperaturaLlama;
    }
    @Override
    public String toString() {
		return "Pokemon: " + nombre + " Tipo: " + tipo + " Velocidad: " + velocidad + " Experiencia: " + experiencia + " Salud: " + salud + " Temperatura de Llama: " + temperaturaLlama;
	}

    public void atacar(Pokemon pk){
        System.out.println(nombre + " ataca a " + pk.getNombre());
        double daño = (getNivel() * FACTOR_NIVEL_FUEGO) + (temperaturaLlama * FACTOR_TEMPERATURA_LLAMA);
        if(pk.getTipo() == "Planta"){
            daño *= MULTIPLICADOR_VENTAJA;
            System.out.println("Es muy efectivo");
        }
        else{
            daño *= MULTIPLICADOR_DESVENTAJA;
            System.out.println("No es muy efectivo");
        }
        System.out.println(nombre + " usa un ataque de fuego causando " + daño + " puntos de daño");
        pk.setSalud(pk.getSalud() - daño);
    }
}
