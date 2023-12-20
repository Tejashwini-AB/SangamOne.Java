//Construct string from subset of char array in different languages.
package com.sangamone.test1;

public class subset_difflang {
	//This method is used to convert the Unicode values to Character
	public static char[] toChars(int[] unicodeVal) {
	    char[] chars = new char[unicodeVal.length];
	    for (int i = 0; i < unicodeVal.length; i++) {
	        chars[i] = (char) unicodeVal[i];
	    }
	    return chars;
	}
	
	public void eng() {
		byte []ascii= {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
		String s1=new String(ascii);
		System.out.println(s1);
		
		String s2=new String(ascii,2,8);
		System.out.println(s2);
	}
	
	public void kan() {
		//String a="\u0CA8";
		//System.out.println(a);
		int[] unico = {0x0C85,0x0C86,0x0C87,0x0C88,0x0C89,0x0C8A,0x0C8B, 0x0C8E,0x0C8F,0x0C90,0xC92,0xC93,0xC94,0xC95, 0xC96, 0xC97, 0xC98, 0xC99, 0xC9A,0xC9B, 0xC9C, 0xC9D  }; 
        String s1 = new String(unico, 0, unico.length);
        System.out.println(s1);
        
        String s2 = new String(unico, 0, 9);
        System.out.println(s2);
	}
	
	public void hin() {
		int[] unicod = {0x0905,0x0906,0x0907,0x0908,0x0909,0x090A,0x090B,0x090F,0x0910,0x0913,0x0914,0x0915, 0x0916, 0x0917, 0x0918, 0x0919, 0x091A, 0x091B,0x091C, 0x091D };
	    String s1 = new String(toChars(unicod));
	    System.out.println(s1);

	    String s2 = new String(toChars(unicod), 0, 7);
	    System.out.println(s2);
	}
	
	public void span() {
		 int[] unicod = {0x00E1, 0x00E9, 0x00ED, 0x00F3, 0x00FA, 0x00FC, 0x00F1};
	     String s1 = new String(toChars(unicod));
	     System.out.println(s1);

	     String s2 = new String(toChars(unicod), 1, 3);
	     System.out.println(s2);
	}
	
	public void jap() {
		 int[] unicod = {0x3042, 0x3044, 0x3046, 0x3048, 0x304A, 0x304B,0x304D,0x304F,0x3051,0x3053,0x3055,0x3057};
	     String s1 = new String(toChars(unicod));
	     System.out.println(s1);
	     
	     String s2 = new String(toChars(unicod), 3, 8);
	     System.out.println(s2);
	}

	public static void main(String[] args) {
		subset_difflang language=new subset_difflang();
		language.eng();
		System.out.println();
		language.kan();
		System.out.println();
		language.hin();
		System.out.println();
		language.span();
		System.out.println();
		language.jap();
	}

}
