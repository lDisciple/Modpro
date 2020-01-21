public class Main {
	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Word";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Word")) {
			// TODO: Do your stuff here
			System.out.println("Word generation");
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}
}