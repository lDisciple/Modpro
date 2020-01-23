import java.util.Random;

public class Main {
	private static Random random;

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Number Generator";
	}

	public static int genInt() {
		return random.nextInt();
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Number Generator")) {
			System.out.println("Generated Number: " + genInt());
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}
}