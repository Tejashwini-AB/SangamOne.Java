//Program to print the entered 2 digit English number in Kannada 
package com.sangamone.test1;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class T3{
	public static void convert20(int n1)throws IOException{
		File f1=new File("kwords.txt");
		ArrayList<String> list1=new ArrayList<>();
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			list1.add(sc1.nextLine());
	}
		String word1;
		int num1=n1;
		word1=list1.get(num1-1);
		System.out.print(word1+" ");
}
	
	public static void convert2d(int n2)throws IOException{
		File f2=new File("fkwords.txt");
		ArrayList<String> list2=new ArrayList<>();
		Scanner sc2=new Scanner(f2);
		while(sc2.hasNextLine()) {
			list2.add(sc2.nextLine());
	}
		String word2;
		int num2=n2;
		word2=list2.get(num2-1);
		System.out.print(word2+" ");
		
}
	
	public static void convert0(int n3)throws IOException{
		File f3=new File("zerowords.txt");
		ArrayList<String> list3=new ArrayList<>();
		Scanner sc3=new Scanner(f3);
		while(sc3.hasNextLine()) {
			list3.add(sc3.nextLine());
			
	}
		//System.out.print(list3+" ");
		String word3;
		int num3=n3;
		word3=list3.get(num3-1);
		System.out.print(word3);
		
}
	public static void main(String[] args)throws IOException{
		System.out.println("This program will work upto 99");
		System.out.println("Enter any number: ");
		Scanner sc4=new Scanner(System.in);
		int num1=sc4.nextInt();
		if(num1<=20) {
			convert20(num1);
		}
		else if(num1%10==0) {
			int p1=num1/10;
			convert0(p1);
			
		}
		else {
			int part1=num1/10;
			int part2=num1%10;
			convert2d(part1);
			convert20(part2);
		}
		
		
	}
}


