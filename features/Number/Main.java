//import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
/**
 * Main class file
 */
public class Main {
	private static Random random;
	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Number Generator"; // Change name
	}

	public static int genInt() {
		return random.nextInt();
	}
	
	public static void interactWithUserOnAPersonalLevel() {}
	
	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Number Generator")) { // Change to right name
			// Do your stuff here
			interactWithUserOnAPersonalLevel();
			System.out.println(genInt());
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