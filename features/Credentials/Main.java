public class Main {
	
	public static String credentials() {
		return "\nEmail: " + email() + "\nPassword: " + stringFromCharset();
	}

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Credentials Generator";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Credentials Generator")) {
			System.out.println("Generated Credentials: " + credentials());
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}


}