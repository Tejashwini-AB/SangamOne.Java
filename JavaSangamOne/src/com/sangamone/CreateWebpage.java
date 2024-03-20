package com.sangamone;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class CreateWebpage {

	public static void main(String[] args) throws Exception {
		File f1=new File("users.txt");
		Scanner sc1=new Scanner(f1);
		ArrayList<String>emails=new ArrayList<>();
		ArrayList<String>names=new ArrayList<>();
		String[] arr1=null;
		String s1;
		while(sc1.hasNext()) {
			arr1=sc1.nextLine().split(",");
			emails.add(arr1[1]);
			names.add(arr1[2]);	
		}
		System.out.println(emails);
		System.out.println(names);
		
		File f2=new File("template.html");
		Scanner sc2=new Scanner(f2);
		FileWriter fw1=new FileWriter("out.html");
		while(sc2.hasNext()) {
			s1=sc2.nextLine().replace("name","Tejashwini").replace("email", "tejashwiniab.sangamone");
			fw1.write(s1);	
			fw1.write("\n");
		}
		fw1.close();
	}
	

}
