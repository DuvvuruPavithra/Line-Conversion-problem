package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonUc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x1,y1,x2,y2;
       double distance;
       
       Scanner sc = new Scanner(System.in);  // Create a Scanner object
       System.out.println("Enter X1 point : ");
   	   x1=sc.nextInt();
   	   System.out.println("Enter y1 point : ");
	   y1=sc.nextInt();
	   System.out.println("Enter x2 point : ");
	   x2=sc.nextInt();
	   System.out.println("Enter y2 point : ");
	   y2=sc.nextInt();
	   
	   distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	   System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);

}

}
