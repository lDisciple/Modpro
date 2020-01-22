import java.util.Scanner;

/**
 * Main class file
 */
public class Main {
	public static Boolean confirm() {
		System.out.println("Are you sure you want to exit? y/n");
		String choice = input.next();
		if (choice.equals("y")) {
			System.out.println("Are you SUUUURRREE you want to exit? y/n");
			choice = input.next();
			if (choice.equals("y")) {
				return true;
			}
		}

		return false;
	}
}