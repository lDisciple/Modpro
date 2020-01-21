import java.util.Arrays;

public class Main {
	private static String[] DOMAINS;
	
	private static void setup() {
		original();
		DOMAINS = readfile("src/domains.txt");
		addToSpecial(DOMAINS);
	}
	
	private static String[] getDomainList() {
		return DOMAINS;
	}
}