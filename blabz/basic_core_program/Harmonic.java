package com.blabz.basic_core_program;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Harmonic series is");
		double r=0; 
		while(n>0)
		{
			r=r+ (double)1/n;
			
			System.out.println(r);
			n--;
		}
	}

}
