package Hito2;

public class Main {

	public static void main(String[] args) {
		Entrenador entrenador = new Entrenador("Ash");
		Pokemon Pikachu = new Pokemon("Pikachu", "Rayo");
		Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Planta");
		Pokemon Charmander = new Pokemon("Charmander", "Fuego");
		Pokemon Squirtle = new Pokemon("Squirtle", "Agua");
		Pokemon Jigglypuff = new Pokemon("Jigglypuff", "Normal");
		Pokemon Geodude = new Pokemon("Geodude", "Roca");
		Pokemon Machop = new Pokemon("Machop", "Lucha");
		Pokemon Abra = new Pokemon("Abra", "Psíquico");
		Pokemon Onix = new Pokemon("Onix", "Roca");
		
		Imprimirpokemons(Pikachu.toString(), Bulbasaur.toString(), Charmander.toString(), Squirtle.toString(), Jigglypuff.toString() Geodude.toString(), Machop.toString(), Abra.toString(), Onix.toString());
		
		public static void Imprimirpokemons(String infoPikachu, String infoBulbasaur, String infoCharmander, String infoSquirtle, String infoJigglypuff, String infoGeudude, String infoMachop, String infoAbra, String infoOnix) {
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

}
