//import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main class file
 */
public class Main {
	
	public static void credentials() {
		email();
		System.out.println(stringFromCharset());
	}

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Credentials Generator";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Credentials Generator")) {
			credentials();
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}


}