import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	private static String[] BASIC_DICT = new String[0];
	
	private static void addToBasic(String[] arr) {
		String[] ret = new String[BASIC_DICT.length+arr.length];
		System.arraycopy(BASIC_DICT, 0, ret, 0, BASIC_DICT.length);
		System.arraycopy(arr, 0, ret, BASIC_DICT.length, arr.length);
		BASIC_DICT = ret;
	}
	private static String[] getBasicList() {
		return BASIC_DICT;
	}
}