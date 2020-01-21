public class Main {
	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Filename";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Filename")) {
			// TODO: Do your stuff here
			System.out.println("Filename generation");
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}
}