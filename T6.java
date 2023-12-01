//Program to store sales of an electronic appliance on daily basis and track the monthly sales
package com.sangamone.test1;

public class T6 {

	public static void main(String[] args) {
		int[][] sales=new int[12][31];
		 int[]days=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		 int[]salesm=new int[12];
		 int month_t=0;
		 int grandtotal=0;
		 int totalm=0;
		 
		 for(int i=0;i<12;i++) {
			 System.out.print((i+1)+"-");
			 for(int j=0;j<days[i];j++) {
				 sales[i][j]=(int)(Math.random()*10);
				 System.out.print(sales[i][j]+",");
				 month_t=month_t+sales[i][j];
			 }
			 System.out.println(" ");
			 salesm[i]=month_t;
			 grandtotal=grandtotal+salesm[i];
			 month_t=0;
			 System.out.print("\n");
		 }
		 for(int i=0;i<12;i++) {
			 System.out.println("Sales of Month "+(i+1)+"="+salesm[i]);
		 }
		 System.out.println("Grand total: "+grandtotal);
	}
}
