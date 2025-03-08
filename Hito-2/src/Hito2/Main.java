package Hito2;

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
		
		Imprimirpokemons(Pikachu.toString(), Bulbasaur.toString(), Charmander.toString(), Squirtle.toString(), Jigglypuff.toString() , Geodude.toString(), Machop.toString(), Abra.toString(), Onix.toString());
		System.out.println("== Capturas ==");
		entrenador.capturarpokemon(Pikachu);
		entrenador.capturarpokemon(Bulbasaur);
		entrenador.capturarpokemon(Charmander);
		entrenador.capturarpokemon(Squirtle);
		entrenador.capturarpokemon(Jigglypuff);
		entrenador.capturarpokemon(Geodude);
		entrenador.capturarpokemon(Machop);
		entrenador.capturarpokemon(Abra);
		entrenador.capturarpokemon(Onix);
		
		System.out.println("El entrenador" + entrenador.getNombre() + " tiene los siguientes pokemons capturados:");
		for(int i = 0; i < entrenador.getPokemons().length; i++) {
			if(!(entrenador.getPokemons()[i] instanceof Pokemon)) {
				break;
			}
			System.out.println(entrenador.getPokemons()[i].toString());
		}

		
		}//fin main
		
		public static void Imprimirpokemons(String infoPikachu, String infoBulbasaur, String infoCharmander, String infoSquirtle, String infoJigglypuff, String infoGeodude, String infoMachop, String infoAbra, String infoOnix) {
			System.out.println("== Información pokemons ==");
			System.out.println(infoPikachu);
			System.out.println(infoBulbasaur);
			System.out.println(infoCharmander);
			System.out.println(infoSquirtle);
			System.out.println(infoJigglypuff);
			System.out.println(infoGeodude);
			System.out.println(infoMachop);
			System.out.println(infoAbra);
			System.out.println(infoOnix);

		

	}
		
}
//fin class