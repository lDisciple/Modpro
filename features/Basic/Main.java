import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	private static String[] BASIC = new String[0];
	
	private static void addToBasic(String[] arr) {
		String[] ret = new String[BASIC.length+arr.length];
		System.arraycopy(BASIC, 0, ret, 0, BASIC.length);
		System.arraycopy(arr, 0, ret, BASIC.length, arr.length);
		BASIC = ret;
	}
	private static String[] getBasicList() {
		return BASIC;
	}
}