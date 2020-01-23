public class Main {

	public static void exit() {
		System.exit(0);
	}

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Exit";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Exit")) {
			exit();
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}

}