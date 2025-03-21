package Hito2;


public class Entrenador {
	private String nombre;
	private int nivel;
	public Pokemon equipoPokemons[] = new Pokemon [6]; //array de pokemons
	public Pokeball pokeballs [] = new Pokeball [6];{		
	//creamos las pokeballs
	pokeballs[0] = new Pokeball (4,10);
	pokeballs[4] = new Pokeball (4,10);
	pokeballs[1] = new Superball (12,20);
	pokeballs[5] = new Superball (10,20);
	pokeballs[2] = new Ultraball (12,50);
	pokeballs[3] = new Masterball (4,100,80);}
	
	public Entrenador (String nombre, int nivel) {
		this.nombre = nombre;
		this.nivel = nivel;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public String getNombre() {
		return nombre;
	}
	public Pokemon[] getequipoPokemons() {
		return equipoPokemons;
	}
	public Pokeball[] getPokeballs() {
		return pokeballs;
	}
	
	public void capturarpokemon(Pokemon pokemon) {

		for(int i = 0; i < pokeballs.length; i++){
			if(pokeballs[i].getIntegridad() <= 0){
				continue;
			}
			if(pokeballs[i].Captura(pokemon) == true){
				equipoPokemons[i] = pokemon;
				return;
			}
			break;
		}
	}
		
	
}





