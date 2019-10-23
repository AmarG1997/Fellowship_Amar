package com.blabz.functional_program;

import java.util.Scanner;

public class Wind_Chill {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter temperature");
		double temp=scanner.nextDouble();
		System.out.println("Enter WindSpped");
		double v=scanner.nextDouble();
		
		if(temp<50 && v<120)
		{
	double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(v, 0.16);
			 System.out.println(w);
		}
		else
		{
			System.out.println("Enter correct values");
		}
		
		
	}
}
