package src;

public class Pokemon_Agua extends Pokemon implements IFormulasDanio {
        private double presionAgua;
    
        public Pokemon_Agua(String nombrepokemon, String tipopokemon, double nivelpokemon, double velocidadpokemon, double experienciapokemon, double saludpokemon, double presionAgua) {
            super(nombrepokemon, tipopokemon, nivelpokemon, velocidadpokemon, experienciapokemon, saludpokemon);
            this.presionAgua = presionAgua;
        }
        @Override
        public String toString() {
            return "Pokemon: " + nombre + " Tipo: " + tipo + " Velocidad: " + velocidad + " Experiencia: " + experiencia + " Salud: " + salud + " Presion de Agua: " + presionAgua;
        }
    
        @Override
        public void atacar(Pokemon pk) {
            System.out.println(nombre + " ataca a " + pk.getNombre());
            double daño = (getNivel() * FACTOR_NIVEL_AGUA) + (presionAgua * FACTOR_PRESION_AGUA);
            if(pk.getTipo() == "Fuego"){
                daño *= MULTIPLICADOR_VENTAJA;
                System.out.println("Es muy efectivo");
            }
            else{
                daño *= MULTIPLICADOR_DESVENTAJA;
                System.out.println("No es muy efectivo");

            }
            System.out.println(nombre + " usa un ataque de agua causando " + daño + " puntos de daño");

            pk.setSalud(pk.getSalud() - daño);
        }
}
