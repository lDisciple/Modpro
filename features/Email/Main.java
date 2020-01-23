import java.util.Scanner;

/**
 * Main class file
 */
public class Main {
	
	public static String email() {
		String[] name = getNameList();
		int nameIndex = Math.abs(genInt()) % name.length;
		String[] domain = getDomainList();
		int domainIndex = Math.abs(genInt()) % domain.length;
		int number = Math.abs(genInt()) % 100;		
		return name[nameIndex].toLowerCase() + number + "@" + domain[domainIndex];
	}

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Email Generator";
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Email Generator")) {
			System.out.println("Generated Email: " + email());
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() {
		return original() + 1;
	}


}