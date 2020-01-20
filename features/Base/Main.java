import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main class file
 */
public class Main {
	private static Scanner input = new Scanner(System.in);
	private static String[] mainMenuItems = new String[getMainMenuItemCount()];
	private static int fillerIndex = 0;
	
	public static int getMainMenuItemCount() {
		return 0;
	}
	public static void fillMainMenuItems() {
		fillerIndex = 0;
	}
	
	public static boolean action(String selection) {
		return false;
	}
	
	public static void main(String[] args) {
		fillMainMenuItems();
		while(true) {
			String selected = menu(mainMenuItems);
			if(!action(selected)) {
				System.out.println("That is not a valid option.");
			}
		}
	}
	
	public static int getInt() {
		return input.nextInt();
	}
	public static String menu(String[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.printf("%2d) %s%n", i, items[i]);
		}
		int answer = getInt();
		while(answer < 0 || answer >= items.length) {
			System.out.println("Invalid option.");
			answer = getInt();
		}
		return items[answer];
	}
	
	
}