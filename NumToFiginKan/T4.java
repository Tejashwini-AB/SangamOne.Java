//Program to print the entered 2 digit English number in Kannada
package com.sangamone.test1;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class T4{
	public static void convert9(int n1)throws IOException{
		System.setProperty("file.encoding", "UTF-8");
		File f1=new File("knum.txt");
		ArrayList<String> list1=new ArrayList<>();
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			list1.add(sc1.nextLine());
	}
		String word1;
		int num1=n1;
		word1=list1.get(num1-1);
		System.out.print(word1+"");
}
	


	public static void main(String[] args)throws IOException{
		System.out.println("This program will work upto 99");
		System.out.println("Enter any number: ");
		Scanner sc3=new Scanner(System.in);
		int num1=sc3.nextInt();
		if(num1<=9) {
			convert9(num1);
		}
		else if(num1%10==0) {
			int part1=num1/10;
			convert9(part1);
			int part2=num1%10;
			if (part2==0){
			System.out.print("೦");
			}
			
		}
		
		else {
			int part1=num1/10;
			int part2=num1%10;
			convert9(part1);
			convert9(part2);	
		}
		
		
	}
}


