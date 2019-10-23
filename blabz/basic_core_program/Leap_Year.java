package com.blabz.basic_core_program;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {
		System.out.println("Enter year");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean flag=false;
		while(n>1990)
		 {
		 if(n%400==0)
			 {
			 flag=true; 
			 break;
			 }
		 else if(n%100==0)
			 {
			 flag=false;
			
			 }
		 else if(n%4==0)
			 {
			 flag=true; 
			break;
			 }
		 }
		

		 if(flag==true)
		 {
			 System.out.println("leap year");
			 
		 }
		 else
		 {
			 System.out.println("not leap year");
		 }
		 
	}
	}

