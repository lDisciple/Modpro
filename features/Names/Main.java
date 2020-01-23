public class Main {
	private static String[] NAMES_DICT;
	
	private static void setup() {
		original();
		NAMES_DICT = readfile("src/names.txt");
		addToBasic(NAMES_DICT);
	}
	
	private static String[] getNameList() {
		return NAMES_DICT;
	}
}