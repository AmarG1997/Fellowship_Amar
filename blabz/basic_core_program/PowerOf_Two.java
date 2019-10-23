package com.blabz.basic_core_program;

import java.util.Scanner;

public class PowerOf_Two {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		int n=s.nextInt();
		//int n=Integer.parseInt(args[0]);
		int pow=1;
		for(int i=0;i<n;i++)
		{
			if(n<30)
			{
				System.out.println("power of 2^"+i+"is="+pow);
				pow=pow*2;
				
			}
			else
			{
				System.out.println("out of range");
			}
		
		}
			
			
		}
}
