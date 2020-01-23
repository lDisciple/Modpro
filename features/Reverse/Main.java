//import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main class file
 */
public class Main {
	
	public static void reverse() {
		System.out.println("Type in the string you want to reverse:");		
		String s = input.next();		
		String rev = new StringBuilder(s).reverse().toString();		
		
		System.out.println(rev);
	}

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Reverse"; // Change name
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Reverse")) { // Change to right name
			// Do your stuff here
			reverse();
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