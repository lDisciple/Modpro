import java.util.Scanner;
import java.util.Random;

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
			System.out.println(printStringFromCharset());
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	public static String printStringFromCharset() {
		String output = "";
		for (int i = 0; i < 10; i++) {
			output += charset.charAt(Math.abs(genInt()) % charset.length());
		}
		return output;

	}

	public static int getMainMenuItemCount() { // Copy-pasta
		return original() + 1;
	}

}