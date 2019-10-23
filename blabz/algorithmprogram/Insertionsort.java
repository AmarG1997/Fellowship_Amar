package com.blabz.algorithmprogram;

import java.util.Scanner;


public class Insertionsort {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String arr[]=new String[10];
	
		System.out.println("Enter 10 elements");
		for(int i=0;i<10;i++)
			arr[i]=scanner.next();
		System.out.println("After sorting:");
		for(int i=1;i<10;i++)
		{
			String comp=arr[i];
			int j=i-1;
			int res=comp.compareTo(arr[j]);
			while( j>=0 && res<0)
			{
			arr[j+1]=arr[j];
			 j=j-1;
			 res=comp.compareTo(arr[j]);
			
			}
			arr[j+1]=comp;
			}
		for(int i=0;i<10;i++)
			System.out.println(arr[i]);

	}

}

