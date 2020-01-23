public class Main {
	
	public static String reverse() {
		System.out.println("Type in the string you want to reverse:");		
		String s = input.next();		
		return new StringBuilder(s).reverse().toString();		
	}

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Reverse String";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Reverse String")) {
			System.out.println("Reversed String: " + reverse());
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}


}