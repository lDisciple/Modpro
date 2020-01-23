import java.util.Scanner;
import java.util.Random;

public class Main {
	private static String charset = "";

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "String Generator";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("String Generator")) {
			System.out.println(stringFromCharset());
			return true;
		} else {
			return r;
		}
	}

	public static String stringFromCharset() {
		String output = "";
		for (int i = 0; i < 10; i++) {
			output += charset.charAt(Math.abs(genInt()) % charset.length());
		}
		return output;

	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}

}
