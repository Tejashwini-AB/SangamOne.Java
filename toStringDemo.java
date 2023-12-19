//Override toStrinf for box class
package com.sangamone.test1;
class box{
	double width;
	double height;
	double depth;
	
	box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	public String toString(){
		return "Dimensions are "+width+" by "+depth+" by "+height+".";
	}
}

public class toStringDemo {

	public static void main(String[] args) {
		box b=new box(10,12,14);
		String s="box b "+b;
		System.out.println(b);
		System.out.println(s);
	}

}
