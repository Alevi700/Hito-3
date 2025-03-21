package Hito2;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Entrenador entrenador = new Entrenador("Ash", 5);
		Pokemon Pikachu = new Pokemon("Pikachu", "Rayo", 1, 30, 0, 100);
		Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Planta", 1, 35, 0, 100);
		Pokemon Charmander = new Pokemon("Charmander", "Fuego", 1, 40, 0, 100);
		Pokemon Squirtle = new Pokemon("Squirtle", "Agua", 1, 25, 0, 100);
		Pokemon Jigglypuff = new Pokemon("Jigglypuff", "Normal", 1, 20, 0, 100);
		Pokemon Geodude = new Pokemon("Geodude", "Roca", 1, 50, 0, 100);
		Pokemon Machop = new Pokemon("Machop", "Lucha", 1, 45, 0, 100);
		Pokemon Abra = new Pokemon("Abra", "Psíquico", 1, 15, 0, 100);
		Pokemon Onix = new Pokemon("Onix", "Roca", 1, 60, 0, 100);
		ArrayList<Pokemon> Salvajes = new ArrayList<>(Arrays.asList(
			Pikachu,Bulbasaur,Charmander, Squirtle, Jigglypuff, Geodude, Machop, Abra, Onix
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

		
		}//fin main
	}
//fin class