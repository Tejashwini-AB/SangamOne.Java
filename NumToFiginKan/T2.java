//Program to print 0-9 in Kannada from text file knum
package com.sangamone.test1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class T2 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("file.encoding", "UTF-8");
		Scanner scanner = new Scanner(new File("knum.txt"));
		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		    System.out.println(line);
		}
		scanner.close();
	}
}
