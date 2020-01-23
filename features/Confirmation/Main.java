public class Main {

	public static Boolean confirm() {
		System.out.println("Are you sure you want to exit? y/n");
		String choice = input.next();
		if (choice.equals("y")) {
			return true;
		}
		return false;
	}

	public static void exit() {
		if (confirm()) {
			original();
		}
	}
}