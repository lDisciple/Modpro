public class Main {
	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Word Generator";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Word Generator")) {
			String[] basics = getBasicList();
			int index = Math.abs(genInt()) % basics.length;
			System.out.println("Random word: " + basics[index]);
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}
}