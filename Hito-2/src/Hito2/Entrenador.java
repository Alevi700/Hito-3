package Hito2;


public class Entrenador {
	private String nombre;
	private int nivel;
	public Pokemon pokemons[] = new Pokemon [6]; //array de pokemons
	private int indicepokeballs = 0;
	private int indicepokemons = 0;
	//pokeballs en array
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
	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public Pokeball[] getPokeballs() {
		return pokeballs;
	}
	
	public Pokemon[] capturarpokemon(Pokemon pokemon) {
		if(pokemons[5] instanceof Pokemon || indicepokeballs >= 6) {
			System.out.println("No puedes llevar más pokemons");
			return pokemons;
		}
		if(pokeballs[indicepokeballs].getIntegridad() <= 0) {
			indicepokeballs++;
		}
		int aleatorio = (int) (Math.random()*100);
		
		if(pokeballs[indicepokeballs] instanceof Superball) {
			cap_superball(pokemon, aleatorio, (Superball) pokeballs[indicepokeballs]);
		}
		else if (pokeballs[indicepokeballs] instanceof Ultraball) {
			cap_ultraball(pokemon, aleatorio, (Ultraball) pokeballs[indicepokeballs]);
		}
		else if (pokeballs[indicepokeballs] instanceof Masterball) {
			cap_masterball(pokemon, aleatorio, (Masterball) pokeballs[indicepokeballs]);
		}
		else {
			cap_pokeball(pokemon, aleatorio);
		}

			
	
		return pokemons;
	}
		
	public Pokemon[] cap_pokeball(Pokemon pokemon, int aleatorio) {
					System.out.println(pokeballs[indicepokeballs].toString());
					pokeballs[indicepokeballs].setIntegridad(pokeballs[indicepokeballs].getIntegridad() - 4);
					if(aleatorio <= pokeballs[indicepokeballs].getProbabilidad()) {
						System.out.println("¡Captura exitosa! " + pokemon.getNombre() + " ahora es tuyo");
						pokemons[indicepokemons] = pokemon;
						indicepokemons++;
					} 
					else {
						System.out.println("La captura de: " + pokemon.getNombre() + " ha fallado");
					}
			return pokemons;
		}
	public Pokemon[] cap_superball(Pokemon pokemon, int aleatorio, Superball sp) {
			System.out.println(sp.toString());
			sp.setIntegridad(sp.getIntegridad() - 4);
			if(aleatorio <= sp.getProbabilidad()) {
				System.out.println("¡Captura exitosa! " + pokemon.getNombre() + " ahora es tuyo");
				pokemons[indicepokemons] = pokemon;
				indicepokemons++;
				indicepokeballs++;
			}
			else {
				System.out.println("La captura de: " + pokemon.getNombre() + " ha fallado");
				sp.setRacha(sp.getRacha() + 1);
				sp.setProbabilidad(sp.getProbabilidad() + 10);
			}
			return pokemons;

		}
	public Pokemon[] cap_ultraball(Pokemon pokemon, int aleatorio, Ultraball ub) {
			System.out.println(ub.toString());
			ub.setIntegridad(ub.getIntegridad() - 4);
			if(aleatorio <= ub.getProbabilidad()) {
				System.out.println("¡Captura exitosa! " + pokemon.getNombre() + " ahora es tuyo");
				pokemons[indicepokemons] = pokemon;
				indicepokemons++;
				indicepokeballs++;
			}
			else {
				
				System.out.println("La captura de: " + pokemon.getNombre() + " ha fallado");
				ub.setPotencia(ub.getPotencia() + 0.2);
				if(ub.getPotencia() == 0.4) {
					ub.setProbabilidad(100);
				}
			}		
		return pokemons;
	}
	public Pokemon[] cap_masterball(Pokemon pokemon, int aleatorio, Masterball mb) {
		System.out.println(mb.toString());
		int daño = (int) (pokemon.getSalud()*((100 - mb.getEstabilidad())/100));
		pokemon.setSalud(pokemon.getSalud()- daño);
		mb.setIntegridad(mb.getIntegridad() - 4);
		System.out.println("¡Captura exitosa! " + pokemon.getNombre() + " ahora es tuyo");
		pokemons[indicepokemons] = pokemon;
		indicepokemons++;

		return pokemons;
	}
}





