import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	private static String[] SPECIAL_DICT = new String[0];
	
	private static void addToSpecial(String[] arr) {
		String[] ret = new String[SPECIAL_DICT.length+arr.length];
		System.arraycopy(SPECIAL_DICT, 0, ret, 0, SPECIAL_DICT.length);
		System.arraycopy(arr, 0, ret, SPECIAL_DICT.length, arr.length);
		SPECIAL_DICT = ret;
	}
	private static String[] getSpecialList() {
		return SPECIAL_DICT;
	}
}