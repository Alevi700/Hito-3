package Hito2;


public class Entrenador {
	private String nombre;
	private int nivel;
	Pokemon pokemons[] = new Pokemon [6]; //array de pokemons
	private int indicepokeballs = 0;
	//creamos las pokeballs
	Pokeball Pokeball = new Pokeball (4,10);
	Pokeball Pokeball2 = new Pokeball (4,10);
	Superball Superball = new Superball (12,20);
	Superball Superball2 = new Superball (10,20);
	Ultraball Ultraball = new Ultraball (12,50);
	Masterball Masterball = new Masterball (4,100,80);
	//pokeballs en array
	Pokeball pokeballs [] = new Pokeball []{Pokeball,Pokeball2,Superball,Superball2,Ultraball,Masterball};
	
	public Entrenador (String nombre, int nivel) {
		this.nombre = nombre;
		this.nivel = nivel;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Pokemon capturarpokemon(Pokemon pokemon) {
		int aleatorio = (int) (Math.random()*100);
		pokeballs[indicepokeballs].setIntegridad(integridad-4);
		
	}

	
}
