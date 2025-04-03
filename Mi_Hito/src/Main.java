package src;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
			Entrenador entrenador = new Entrenador("Ash", 5);
			Pokemon Bulbasaur = new Pokemon_Planta ("Bulbasaur", "Planta", 1, 30, 0, 100, 100);
			Pokemon Charmander = new Pokemon_Fuego ("Charmander", "Fuego", 1, 40, 0, 100.0, 100);
			Pokemon Squirtle = new Pokemon_Agua ("Squirtle", "Agua", 1, 25, 0, 100, 100);
			ArrayList<Pokemon> Salvajes = new ArrayList<>(Arrays.asList(
				Bulbasaur,Charmander, Squirtle
			));

			for(Pokemon pok : Salvajes){
				System.out.println(pok.toString());
			}
			
			System.out.println("== Capturas ==");
			for(Pokemon pok : Salvajes){
				entrenador.capturarpokemon(pok);
			}
			
			System.out.println("El entrenador" + entrenador.getNombre() + " tiene los siguientes pokemons capturados:");
			for(int i = 0; i < entrenador.getequipoPokemons().length; i++) {
				if(!(entrenador.getequipoPokemons()[i] instanceof Pokemon)) {
					continue;
				}
				System.out.println(entrenador.getequipoPokemons()[i].toString());
			}

			System.out.println("== Batalla ==");

				Charmander.atacar(Bulbasaur);
				Charmander.atacar(Squirtle);
				Squirtle.atacar(Charmander);
				Squirtle.atacar(Bulbasaur);

			System.out.println("== Resultados ==");
			System.out.println(Bulbasaur.toString());
			System.out.println(Charmander.toString());
			System.out.println(Squirtle.toString());
		}//fin main
	}
//fin class