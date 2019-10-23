package com.blabz.basic_core_program;

import java.util.Scanner;

public class Flip_Coin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no ");
		int n=s.nextInt();
		double head=0;
		double tails=0;
		//int counter=0;
		double r=0;
		double k=0;
		double p=0;

		//while(counter<n)
		for(int i=0;i<n;i++)
		{
			r=Math.random();
			if(r<0.5)
			{ 

				head++;
		
			}
			else
			{

				tails++;
			}
			
		}
		System.out.println("no of head=" + head);
		System.out.println("no of tails="+ tails);
		k=(head/n)*100;
		System.out.println("percentage:"+k);
		p=(tails/n)*100;
		System.out.println("percentage:"+p);
	}
	}
