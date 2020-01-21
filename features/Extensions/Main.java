import java.util.Arrays;

public class Main {
	private static String[] EXT_DICT;
	
	private static void setup() {
		original();
		EXT_DICT = readfile("src/extensions.txt");
		addToSpecial(EXT_DICT);
	}
	
	private static String[] getExtensionList() {
		return EXT_DICT;
	}
}