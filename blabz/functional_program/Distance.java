package com.blabz.functional_program;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		int x1=0,y1=0,x2,y2;
		double a,b,d,x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x2");
		x2=sc.nextInt();
		System.out.println("Enter value of y2");
		y2=sc.nextInt();
		x=x2-x1;
		y=y2-y1;
		a=Math.pow(x, 2);
		b=Math.pow(y,2);
		d=Math.sqrt(a+b);
		System.out.println("Distance="+d);

		}

}
