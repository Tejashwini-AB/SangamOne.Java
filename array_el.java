package com.sangamone.test1;
import java.util.Scanner;

public class array_el {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int flag=0;
		
        //Array 1 input
        System.out.println("Enter the number of elements for Array 1:");
        int n = scanner.nextInt();
        int[] ar1 = new int[n];
        System.out.println("Enter the elements for Array 1:");
        for (int i = 0; i < n; i++) {
            ar1[i] = scanner.nextInt();
        }
        
        //Array 2 input
        System.out.println("Enter the number of elements for Array 2:");
        int m = scanner.nextInt();
        int[] ar2 = new int[m];
        System.out.println("Enter the elements for Array 2:");
        for (int i = 0; i < m; i++) {
            ar2[i] = scanner.nextInt();
        }
        
        //Checking by comparing the elements of two arrays one by one
        if (ar1.length == ar2.length) {
        	for(int i = 0; i < ar1.length; i++) {
        		if (ar1[i] != ar2[i]) {
        			flag=1;
        			break;
        		}  		
        }
        	 if(flag==0) {
             	System.out.println("The two Arrays are equal");
             }
             else {
             	System.out.println("The two Arrays are not equal");
             }
        	
        }
        else {
        	System.out.println("The two arrays do not have the same number of elements");
        	
        }
	}

}
