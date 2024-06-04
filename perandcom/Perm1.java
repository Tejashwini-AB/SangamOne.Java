package pkg1.perandcom;
import java.util.ArrayList;
import java.util.List;

public class Perm1 {
	public static ArrayList perm3(String s3) {
		String c1=s3.substring(0,1);
		String c2=s3.substring(1,2);
		String c3=s3.substring(2,3);
		ArrayList<String> comb3=new ArrayList<>();
		comb3.add(c1+c2+c3);
		comb3.add(c1+c3+c2);
		comb3.add(c2+c1+c3);
		comb3.add(c2+c3+c1);
		comb3.add(c3+c1+c2);
		comb3.add(c3+c2+c1);
		return comb3;
	}
	public static ArrayList perm4(String s4) {
		ArrayList<String> list4=new ArrayList<String>();
		ArrayList <String> comb4=new ArrayList <String>();
		String c1=s4.substring(0,1);
		String c2=s4.substring(1,2);
		String c3=s4.substring(2,3);
		String c4=s4.substring(3,4);
		
		String word1=c1;
		String word2=c2+c3+c4;
		comb4=perm3(word2);
		for(int i=0;i<6;i++) {
			list4.add(word1+comb4.get(i));
		}	
		word1=c2;
		word2=c1+c3+c4;
		comb4=perm3(word2);
		for(int i=0;i<6;i++) {
			list4.add(word1+comb4.get(i));
		}
		word1=c3;
		word2=c1+c2+c4;
		comb4=perm3(word2);
		for(int i=0;i<6;i++) {
			list4.add(word1+comb4.get(i));
		}
		word1=c4;
		word2=c1+c2+c3;
		comb4=perm3(word2);
		for(int i=0;i<6;i++) {
			list4.add(word1+comb4.get(i));
		}
		return list4;	
	}
	public static ArrayList perm5(String s5) {
		ArrayList<String> comb5=new ArrayList<String>();
		ArrayList<String> list5=new ArrayList<String>();
		String c1=s5.substring(0,1);
		String c2=s5.substring(1,2);
		String c3=s5.substring(2,3);
		String c4=s5.substring(3,4);
		String c5=s5.substring(4,5);
		
		String word1=c1;
		String word2=c2+c3+c4+c5;
		comb5=perm4(word2);
		for(int i=0;i<24;i++) {
			list5.add(word1+comb5.get(i));
		}
		word1=c2;
		word2=c1+c3+c4+c5;
		comb5=perm4(word2);
		for(int i=0;i<24;i++) {
			list5.add(word1+comb5.get(i));
		}
		word1=c3;
		word2=c1+c2+c4+c5;
		comb5=perm4(word2);
		for(int i=0;i<24;i++) {
			list5.add(word1+comb5.get(i));
		}
		word1=c4;
		word2=c1+c2+c3+c5;
		comb5=perm4(word2);
		for(int i=0;i<24;i++) {
			list5.add(word1+comb5.get(i));
		}
		word1=c5;
		word2=c1+c2+c3+c4;
		comb5=perm4(word2);
		for(int i=0;i<24;i++) {
			list5.add(word1+comb5.get(i));
		}
		return list5;
		
	}
	public static void main(String[] args) {
		String s5="SMILE";
		System.out.println(perm5("HELLO"));
		
		
	}
}
