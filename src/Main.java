
import java.util.Scanner; import java.util.Random; import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
import java.nio.file.Files; import java.util.Arrays; 
import java.util.Iterator; 
import java.util.LinkedList; import java.util.ArrayList; 

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

	

	 private static int  getMainMenuItemCount__wrappee__Filename  () {
		return getMainMenuItemCount__wrappee__Number() + 1;
	}

	

	 private static int  getMainMenuItemCount__wrappee__Word  () {
		return getMainMenuItemCount__wrappee__Filename() + 1;
	}

	

	 private static int  getMainMenuItemCount__wrappee__String  () { // Copy-pasta
		return getMainMenuItemCount__wrappee__Word() + 1;
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

	
	 private static void  fillMainMenuItems__wrappee__Filename  () {
		fillMainMenuItems__wrappee__Number();
		mainMenuItems[fillerIndex++] = "Filename";
	}

	
	 private static void  fillMainMenuItems__wrappee__Word  () {
		fillMainMenuItems__wrappee__Filename();
		mainMenuItems[fillerIndex++] = "Word";
	}

	

	 private static void  fillMainMenuItems__wrappee__String  () {
		fillMainMenuItems__wrappee__Word();
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

	

	 private static boolean  action__wrappee__Filename  (String selection) {
		boolean r = action__wrappee__Number(selection);
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
			String[] basics = getBasicList();
			int index = Math.abs(genInt()) % basics.length;
			System.out.println("Random word: " + basics[index]);
			return true;
		} else {
			return r;
		}
	}

	

	 private static boolean  action__wrappee__String  (String selection) {
		boolean r = action__wrappee__Word(selection);
		if (selection.equals("String Generator")) { // Change to right name
			// Do your stuff here
//			printStringFromCharset();
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

	
	 private static void  setup__wrappee__Seeded  () {
		setup__wrappee__Base();
		random = new Random(123);
	}

	
	
	 private static void  setup__wrappee__Animals  () {
		setup__wrappee__Seeded();
		ANIMALS_DICT = readfile("src/animals.txt");
		addToBasic(ANIMALS_DICT);
	}

	
	
	private static void setup() {
		setup__wrappee__Animals();
		EXT_DICT = readfile("src/extensions.txt");
		addToSpecial(EXT_DICT);
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

	
	private static String[] readfile(String path) {
		try {
			Scanner scnFile = new Scanner(new FileReader(path));
			LinkedList lst = new LinkedList();
			while(scnFile.hasNextLine()) {
				lst.add(scnFile.nextLine());
			}
			String[] ret = new String[lst.size()];
			int c = 0;
			for (Object o : lst) {
				ret[c++] = o.toString();
			}
//			System.out.println(Arrays.toString(ret));
			scnFile.close();
			return ret;
		} catch(IOException e) {
			e.printStackTrace();
			System.err.printf("Could not read file: %s%n", path);
			System.exit(0);
			return null;
		}
	}

	
	private static String[] BASIC_DICT = new String[0];

	
	
	private static void addToBasic(String[] arr) {
		String[] ret = new String[BASIC_DICT.length+arr.length];
		System.arraycopy(BASIC_DICT, 0, ret, 0, BASIC_DICT.length);
		System.arraycopy(arr, 0, ret, BASIC_DICT.length, arr.length);
		BASIC_DICT = ret;
	}

	
	private static String[] getBasicList() {
		return BASIC_DICT;
	}

	
	private static String[] ANIMALS_DICT;

	
	
	private static String[] getAnimalList() {
		return ANIMALS_DICT;
	}

	
	private static String[] SPECIAL_DICT = new String[0];

	
	
	private static void addToSpecial(String[] arr) {
		String[] ret = new String[SPECIAL_DICT.length+arr.length];
		System.arraycopy(SPECIAL_DICT, 0, ret, 0, SPECIAL_DICT.length);
		System.arraycopy(arr, 0, ret, SPECIAL_DICT.length, arr.length);
		SPECIAL_DICT = ret;
	}

	
	private static String[] getSpecialList() {
		return SPECIAL_DICT;
	}

	
	private static String[] EXT_DICT;

	
	
	private static String[] getExtensionList() {
		return EXT_DICT;
	}


}
