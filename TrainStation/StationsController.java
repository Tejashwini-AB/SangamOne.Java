package pkg1.trainstations;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationsController  {
	@GetMapping("stations/get")
	public String getAllStations() throws IOException{
		File f1=new File("railwaystations1.txt");
		Scanner sc1=new Scanner(f1);
		String s1,s2="";
		//String []arr1=new String[6];
		ArrayList<String>stationNames=new ArrayList<>();
		ArrayList<String>stationCodes=new ArrayList<>();
		while(sc1.hasNext()) {
			s1=sc1.nextLine();
			System.out.println(s1);
			String[] arr1=s1.split(",");
			stationNames.add(arr1[0]);
			stationCodes.add(arr1[1]);
			s2=s2+arr1[0]+","+arr1[1]+"\n";		
		}
		return s2;
	}
}
