//Using Random class to generate 6 digit otp.
package com.sangamone.test1;
import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random rn=new Random();
		int rndno=rn.nextInt(1000000);
		System.out.println("Your OTP is: "+rndno);
	}
}
