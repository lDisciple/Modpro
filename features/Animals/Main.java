import java.util.Arrays;

public class Main {
	private static String[] ANIMALS_DICT;
	
	private static void setup() {
		original();
		ANIMALS_DICT = readfile("src/animals.txt");
		addToBasic(ANIMALS_DICT);
	}
	
	private static String[] getAnimalList() {
		return ANIMALS_DICT;
	}
}