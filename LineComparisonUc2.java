package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonUc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,y1,x2,y2,a1,b1,a2,b2;
		Double distance1,distance2;
		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter X1 point : ");
		x1=sc.nextInt();
		System.out.println("Enter y1 point : ");
		y1=sc.nextInt();
		System.out.println("Enter x2 point : ");
		x2=sc.nextInt();
		System.out.println("Enter y2 point : ");
		y2=sc.nextInt();

		System.out.println("Enter a1 point : ");
		a1=sc.nextInt();
		System.out.println("Enter b1 point : ");
		b1=sc.nextInt();
		System.out.println("Enter a2 point : ");
		a2=sc.nextInt();
		System.out.println("Enter b2 point : ");
		b2=sc.nextInt();


		distance1 = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2) );
		distance2 = Math.sqrt(Math.pow((a2-a1),2)+ Math.pow((b2-b1),2) );
				
		System.out.println("Enter the X and Y coordinates :" +distance1);
		System.out.println("Enter the A and B coordinates :" +distance2);


		boolean length = distance1.equals(distance2);
		if(length == true)
			System.out.println("Both the lengths are equal");
		else
			System.out.println("Both the lengths are not equal");
		

	}

}
