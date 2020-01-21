//import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main class file
 */
public class Main {
//	private static Scanner input = new Scanner(System.in);
//	private static String[] mainMenuItems = getMainMenuItems();

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Exit";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Exit")) {
			System.exit(0);
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}

//	public static void main(String[] args) {
//		while(true) {
//			String selected = menu(mainMenuItems);
//			switch (selected) {
//			case "Exit":
//				System.exit(0);
//				break;
//			default:
//				System.out.println("No such option exists.");
//				break;
//			}
//		}
//	}
//	
//	public static int getInt() {
//		return input.nextInt();
//	}
//	public static String menu(String[] items) {
//		for (int i = 0; i < items.length; i++) {
//			System.out.printf("%2d) %s", i, items[i]);
//		}
//		int answer = getInt();
//		while(answer < 0 || answer >= items.length) {
//			answer = getInt();
//			System.out.println("Invalid option.");
//		}
//		return items[answer];
//	}
//	

}