package com.sangamone.p1;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnivController1 {
	public static ArrayList<String> loadData(String fname)throws FileNotFoundException{
		ArrayList<String> list1=new ArrayList<>();
		File f1= new File(fname);
		Scanner sc1=new Scanner(f1);
		while (sc1.hasNext()){
			list1.add(sc1.nextLine());
			
		}
		return list1;
	
	}
	@GetMapping("/univ1")
	public static ArrayList<String> getUniv()throws FileNotFoundException{
		return loadData("univIndia.txt");
	}
	
}
