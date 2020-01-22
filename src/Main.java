
import java.util.Scanner; 
import java.util.Random; 
import java.io.File; import java.io.BufferedReader; 
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

	

	 private static int  getMainMenuItemCount__wrappee__Word  () {
		return getMainMenuItemCount__wrappee__Number() + 1;
	}

	

	 private static int  getMainMenuItemCount__wrappee__String  () { // Copy-pasta
		return getMainMenuItemCount__wrappee__Word() + 1;
	}

	

	 private static int  getMainMenuItemCount__wrappee__Error  () { // Copy-pasta
		return getMainMenuItemCount__wrappee__String() + 1;
	}

	

	public static int getMainMenuItemCount() { // Copy-pasta
		return getMainMenuItemCount__wrappee__Error() + 1;
	}

	

	 private static void  fillMainMenuItems__wrappee__Base  () {
		fillerIndex = 0;
	}

	
	 private static void  fillMainMenuItems__wrappee__Number  () {
		fillMainMenuItems__wrappee__Base();
		mainMenuItems[fillerIndex++] = "Number Generator"; // Change name
	}

	
	 private static void  fillMainMenuItems__wrappee__Word  () {
		fillMainMenuItems__wrappee__Number();
		mainMenuItems[fillerIndex++] = "Word";
	}

	

	 private static void  fillMainMenuItems__wrappee__String  () {
		fillMainMenuItems__wrappee__Word();
		mainMenuItems[fillerIndex++] = "String Generator"; // Change name
	}

	

	 private static void  fillMainMenuItems__wrappee__Error  () {
		fillMainMenuItems__wrappee__String();
		mainMenuItems[fillerIndex++] = "Error"; // Change name
	}

	

	public static void fillMainMenuItems() {
		fillMainMenuItems__wrappee__Error();
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

	

	 private static boolean  action__wrappee__Word  (String selection) {
		boolean r = action__wrappee__Number(selection);
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
			System.out.println(printStringFromCharset());
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	

	 private static boolean  action__wrappee__Error  (String selection) {
		boolean r = action__wrappee__String(selection);
		if (selection.equals("Error")) { // Change to right name
			// Do your stuff here
			error();
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	

	public static boolean action(String selection) {
		boolean r = action__wrappee__Error(selection);
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

	
	 private static void  setup__wrappee__Unseeded  () {
		setup__wrappee__Base();
		random = new Random();
	}

	
	 private static void  setup__wrappee__Alpha  () {
		setup__wrappee__Unseeded();
		charset += "abcdefghijklmnopqrstuvwxyz";
	}

	
	 private static void  setup__wrappee__Numeric() {
		setup__wrappee__Alpha();
		charset += "0123456789";
	}

	
	 private static void  setup__wrappee__Printable() {
		setup__wrappee__Numeric();
		charset += "/\\%!@#$^&*()-_=+.,<>\'\"{}[]?|";
	}

	
	 private static void  setup__wrappee__NonPrintable  () {
		setup__wrappee__Printable();
		charset += "\t\r\n\b";
	}

	
	
	 private static void  setup__wrappee__Animals  () {
		setup__wrappee__NonPrintable();
		ANIMALS_DICT = readfile("src/animals.txt");
		addToBasic(ANIMALS_DICT);
	}

	
	
	 private static void  setup__wrappee__Names  () {
		setup__wrappee__Animals();
		NAMES_DICT = readfile("src/names.txt");
		addToBasic(NAMES_DICT);
	}

	
	
	private static void setup() {
		setup__wrappee__Names();
		DOMAINS = readfile("src/domains.txt");
		addToSpecial(DOMAINS);
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

	

	public static String printStringFromCharset() {
		String output = "";
		for (int i = 0; i < 10; i++) {
			output += charset.charAt(Math.abs(genInt()) % charset.length());
		}
		return output;

	}

	

	private static void infrec() {
		infrec();
	}

	
	private static void memrec() {
		long[] s = new long[Integer.MAX_VALUE];
		memrec();
		int v = s.length;
	}

	
	
	public static void genError() {
		int v = Math.abs(genInt()%6);
		String s = null;
		System.out.println(v);
		switch (v) {
		case 0:
			// Null pointer
			s.trim();
			break;
		case 1:
			// Format
			Integer.parseInt(printStringFromCharset());
			break;
		case 2:
			// Invalid init
			v = -1;
			String[] sarr = new String[v];
			break;
		case 3:
			// Filenotfound
			new File(printStringFromCharset());
			break;
		case 4:
			// infrec
			infrec();
			break;
		case 5:
			// memrec
			memrec();
			break;
		}
	}

	
	
	public static void error() {
		Thread[] threads = new Thread[25];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					genError();
				}
			});
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}

	
	
	 private static void  exit__wrappee__Exit  () {
		System.exit(0);
	}

	
	
	public static void exit  () {
		System.out.println("Are you sure you want to exit? y/n");
		String choice = input.next();

		if (choice.equals("y")) {
			System.out.println("Are you SUUUURRREE you want to exit? y/n");
			choice = input.next();
				
			if (choice.equals("y")) {
				System.exit(0);
			}
		}
	}

	
	public static void greetingMessage  () {
		System.out.println("See you soon... hopefully in less :3 UwU");
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

	
	private static String[] NAMES_DICT;

	
	
	private static String[] getNameList() {
		return NAMES_DICT;
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

	
	private static String[] DOMAINS;

	
	
	private static String[] getDomainList() {
		return DOMAINS;
	}


}
