public class Main {
	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Filename";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Filename")) {
			String name = stringFromCharset();
			String[] extension = getExtensionList();
			int index = Math.abs(genInt()) % extension.length;
			System.out.println("Filename generated: " + name + "." + extension[index]);
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}
}