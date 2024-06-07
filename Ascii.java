package pkg1;
import java.util.ArrayList;

public class Ascii {

	public static void main(String[] args) {
		ArrayList<Integer>asciinum=new ArrayList<>();
		ArrayList<Character>list2=new ArrayList<>();
		//char ch='A';
		//int numVal=(int)ch;
		for(char i='A';i<='Z';i++) {
			asciinum.add((int)i);
		}
		//char val=(char)asciinum.65;
		for(int i=0;i<26;i++) {
			//System.out.print((char)(asciinum.get(i)));
			
			
		}
		System.out.println(asciinum);
	}
	
}
