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
		mainMenuItems[fillerIndex++] = "Credentials"; // Change name
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Credentials")) { // Change to right name
			// Do your stuff here
			credentials();
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