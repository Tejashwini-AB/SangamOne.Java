package com.sangamone.test1;
import java.util.Scanner;

public class Ternary_op {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		String s1="You are eligible to vote";
		String s2="You are not eligible to vote";
		String eligible="";
		
		eligible=age>18?s1:s2;
		System.out.println(eligible);
	}

}
