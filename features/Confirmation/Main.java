//import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main class file
 */
public class Main {
	
	public static void exit() {
		System.out.println("Are you sure you want to exit? y/n");
		String choice = input.next();

		if (choice.equals("y")) {	
			System.exit(0);			
		}
	}
}