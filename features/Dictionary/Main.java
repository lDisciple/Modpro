import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private static String[] readfile(String path) {
		try {
			Scanner scnFile = new Scanner(new FileReader(path));
			LinkedList lst = new LinkedList();
			while(scnFile.hasNextLine()) {
				lst.add(scnFile.nextLine());
			}
			String[] ret = new String[lst.size()];
			int c = 0;
			for (Object o : lst) {
				ret[c++] = o.toString();
			}
//			System.out.println(Arrays.toString(ret));
			scnFile.close();
			return ret;
		} catch(IOException e) {
			e.printStackTrace();
			System.err.printf("Could not read file: %s%n", path);
			System.exit(0);
			return null;
		}
	}
}