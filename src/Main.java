//import java.util.LinkedList;
import java.util.Scanner; import java.util.Random; 

/**
 * Main class file
 */
public   class  Main {
	
	private static Scanner input = new Scanner(System.in);

	
	private static String[] mainMenuItems = new String[getMainMenuItemCount()];

	
	private static int fillerIndex = 0;

	

	 private static int  getMainMenuItemCount__wrappee__Base  () {
		return 0;
	}

	

	 private static int  getMainMenuItemCount__wrappee__Number  () { // Copy-pasta
		return getMainMenuItemCount__wrappee__Base() + 1;
	}

	

	public static int getMainMenuItemCount() { // Copy-pasta
		return getMainMenuItemCount__wrappee__Number() + 1;
	}

	

	 private static void  fillMainMenuItems__wrappee__Base  () {
		fillerIndex = 0;
	}

	
	 private static void  fillMainMenuItems__wrappee__Number  () {
		fillMainMenuItems__wrappee__Base();
		mainMenuItems[fillerIndex++] = "Number Generator"; // Change name
	}

	

	public static void fillMainMenuItems() {
		fillMainMenuItems__wrappee__Number();
		mainMenuItems[fillerIndex++] = "Exit"; // Change name
	}

	

	 private static boolean  action__wrappee__Base  (String selection) {
		return false;
	}

	
	
	 private static boolean  action__wrappee__Number  (String selection) {
		boolean r = action__wrappee__Base(selection);
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

	

	public static boolean action(String selection) {
		boolean r = action__wrappee__Number(selection);
		if (selection.equals("Exit")) { // Change to right name
			// Do your stuff here
			exit();
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	
	
	private static void setup() {}

	

	public static void main(String[] args) {
		setup();
		fillMainMenuItems();
		while (true) {
			String selected = menu(mainMenuItems);
			if (!action(selected)) {
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
		while (answer < 0 || answer >= items.length) {
			System.out.println("Invalid option.");
			answer = getInt();
		}
		return items[answer];
	}

	
	private static Random random;

	

	public static int genInt() {
		return random.nextInt();
	}

	
	
	 private static void  interactWithUserOnAPersonalLevel__wrappee__Number  () {}

	
	private static void interactWithUserOnAPersonalLevel() {
		interactWithUserOnAPersonalLevel__wrappee__Number();
		random = new Random();
	}

	
	
	public static void exit() {
		System.exit(0);
	}


}
