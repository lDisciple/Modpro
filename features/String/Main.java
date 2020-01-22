import java.util.Scanner;
import java.util.Random;

public class Main {
	private static String charset = "";

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "String Generator"; // Change name
	}
	
	private static void setCharset() {}
	
	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("String Generator")) { // Change to right name
			// Do your stuff here
			setCharset();
			printStringFromCharset();
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	public static void printStringFromCharset() {
		String output = "";
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			output += charset.charAt(Math.abs(r.nextInt()) % charset.length());
		}

		System.out.println(output);
	}

	public static int getMainMenuItemCount() { // Copy-pasta
		return original() + 1;
	}

}