import java.util.Scanner;

public class Main {
	private static String charset = "";

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "String Generator"; // Change name
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("String Generator")) { // Change to right name
			// Do your stuff here
			printStringFromCharset();
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() { // Copy-pasta
		return original() + 1;
	}


}