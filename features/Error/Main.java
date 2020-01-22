//import java.util.LinkedList;
import java.io.File;
import java.util.Scanner;

/**
 * Main class file
 */
public class Main {

	private static void infrec() {
		infrec();
	}
	private static void memrec() {
		long[] s = new long[Integer.MAX_VALUE];
		memrec();
		int v = s.length;
	}
	
	public static void genError() {
		int v = Math.abs(genInt()%6);
		String s = null;
		System.out.println(v);
		switch (v) {
		case 0:
			// Null pointer
			s.trim();
			break;
		case 1:
			// Format
			Integer.parseInt(printStringFromCharset());
			break;
		case 2:
			// Invalid init
			v = -1;
			String[] sarr = new String[v];
			break;
		case 3:
			// Filenotfound
			new File(printStringFromCharset());
			break;
		case 4:
			// infrec
			infrec();
			break;
		case 5:
			// memrec
			memrec();
			break;
		}
	}
	
	public static void error() {
		Thread[] threads = new Thread[25];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					genError();
				}
			});
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}

	public static void fillMainMenuItems() {
		original();
		mainMenuItems[fillerIndex++] = "Error"; // Change name
	}

	public static boolean action(String selection) {
		boolean r = original(selection);
		if (selection.equals("Error")) { // Change to right name
			// Do your stuff here
			error();
			// Stop doing
			return true;
		} else {
			return r;
		}
	}

	public static int getMainMenuItemCount() { // Copy-pasta
		return original() + 1;
	}


}