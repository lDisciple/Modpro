//import java.util.LinkedList;
import java.util.Scanner; public   class  Main {
	
	private static Scanner input = new Scanner(System.in);

	
	private static String[] mainMenuItems = new String[getMainMenuItemCount()];

	
	private static int fillerIndex = 0;

	

	 private static int  getMainMenuItemCount__wrappee__Base  () {
		return 0;
	}

	

	 private static int  getMainMenuItemCount__wrappee__Filename  () {
		return getMainMenuItemCount__wrappee__Base() + 1;
	}

	

	 private static int  getMainMenuItemCount__wrappee__Word  () {
		return getMainMenuItemCount__wrappee__Filename() + 1;
	}

	

	public static int getMainMenuItemCount() { // Copy-pasta
		return getMainMenuItemCount__wrappee__Word() + 1;
	}

	

	 private static void  fillMainMenuItems__wrappee__Base  () {
		fillerIndex = 0;
	}

	
	 private static void  fillMainMenuItems__wrappee__Filename  () {
		fillMainMenuItems__wrappee__Base();
		mainMenuItems[fillerIndex++] = "Filename";
	}

	
	 private static void  fillMainMenuItems__wrappee__Word  () {
		fillMainMenuItems__wrappee__Filename();
		mainMenuItems[fillerIndex++] = "Word";
	}

	

	public static void fillMainMenuItems() {
		fillMainMenuItems__wrappee__Word();
		mainMenuItems[fillerIndex++] = "Exit"; // Change name
	}

	

	 private static boolean  action__wrappee__Base  (String selection) {
		return false;
	}

	

	 private static boolean  action__wrappee__Filename  (String selection) {
		boolean r = action__wrappee__Base(selection);
		if (selection.equals("Filename")) {
			// TODO: Do your stuff here
			System.out.println("Filename generation");
			return true;
		} else {
			return r;
		}
	}

	

	 private static boolean  action__wrappee__Word  (String selection) {
		boolean r = action__wrappee__Filename(selection);
		if (selection.equals("Word")) {
			// TODO: Do your stuff here
			System.out.println("Word generation");
			return true;
		} else {
			return r;
		}
	}

	

	public static boolean action(String selection) {
		boolean r = action__wrappee__Word(selection);
		if (selection.equals("Exit")) { // Change to right name
			// Do your stuff here
			exit();
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	

	 private static void  main__wrappee__Base  (String[] args) {
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

	
	
	 private static void  exit__wrappee__Exit  () {
		System.exit(0);
	}

	
	
	public static void exit() {
		greetingMessage();
		exit__wrappee__Exit();
	}

	
	
	 private static void  greetingMessage__wrappee__Greeting  () {
		return;
	}

	
	public static void greetingMessage() {
		System.out.println("Sexy greeting");
		greetingMessage__wrappee__Greeting();
	}


}
