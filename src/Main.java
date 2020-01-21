//import java.util.LinkedList;
import java.util.Scanner; 
import java.util.Random; 

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

	

	 private static int  getMainMenuItemCount__wrappee__String  () { // Copy-pasta
		return getMainMenuItemCount__wrappee__Number() + 1;
	}

	

	public static int getMainMenuItemCount() { // Copy-pasta
		return getMainMenuItemCount__wrappee__String() + 1;
	}

	

	 private static void  fillMainMenuItems__wrappee__Base  () {
		fillerIndex = 0;
	}

	
	 private static void  fillMainMenuItems__wrappee__Number  () {
		fillMainMenuItems__wrappee__Base();
		mainMenuItems[fillerIndex++] = "Number Generator"; // Change name
	}

	

	 private static void  fillMainMenuItems__wrappee__String  () {
		fillMainMenuItems__wrappee__Number();
		mainMenuItems[fillerIndex++] = "String Generator"; // Change name
	}

	

	public static void fillMainMenuItems() {
		fillMainMenuItems__wrappee__String();
		mainMenuItems[fillerIndex++] = "Exit"; // Change name
	}

	

	 private static boolean  action__wrappee__Base  (String selection) {
		return false;
	}

	
	

	
	 private static boolean  action__wrappee__Number  (String selection) {
		boolean r = action__wrappee__Base(selection);
		if (selection.equals("Number Generator")) { // Change to right name
			// Do your stuff here
			System.out.println(genInt());
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	
	
	 private static boolean  action__wrappee__String  (String selection) {
		boolean r = action__wrappee__Number(selection);
		if (selection.equals("String Generator")) { // Change to right name
			// Do your stuff here
			setCharset();
			printStringFromCharset();
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	

	public static boolean action(String selection) {
		boolean r = action__wrappee__String(selection);
		if (selection.equals("Exit")) { // Change to right name
			// Do your stuff here
			exit();
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	
	
	 private static void  setup__wrappee__Base  () {}

	
	private static void setup() {
		setup__wrappee__Base();
		random = new Random();
	}

	

	 private static void  main__wrappee__Base  (String[] args) {
		setup();
		fillMainMenuItems();
		while (true) {
			String selected = menu(mainMenuItems);
			if (!action(selected)) {
				System.out.println("That is not a valid option.");
			}
		}
	}

	

	public static void main(String[] args) {
		System.out.println("Welcome to Genga!");
		main__wrappee__Base(args);
	}

	

	public static int getInt() {
		int option;
		do {
			String line = input.next();
			option = -1;
			try {
				option = Integer.parseInt(line);
			} catch(NumberFormatException e) {
				System.out.println("Please give an integer.");
			}
		} while(option == -1);
		return option;
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

	
	
	private static void close() {
		input.close();
	}

	
	private static Random random;

	

	public static int genInt() {
		return random.nextInt();
	}

	
	private static String charset = "";

	
	private static void setCharset  () {
		charset += "abcdefghijklmnopqrstuvwxyz";
	}

	

	public static void printStringFromCharset() {
		String output = "";
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			output += charset.charAt(Math.abs(r.nextInt()) % charset.length());
		}

		System.out.println(output);
	}

	
	
	public static void exit() {
		System.exit(0);
	}


}
