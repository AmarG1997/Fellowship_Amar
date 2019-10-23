package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility2 {
	Scanner scanner=new Scanner(System.in);
	public int readInt()
	{
		return scanner.nextInt();
	}
	public String readString()
	{
		return scanner.nextLine();
	}
	public static void insertionsort(String arr[])
	{
		for(int i=1;i<arr.length-1;i++) 
		{
			int j=i-1;
			String key=arr[i];
			String l=arr[j];
			int res=l.compareTo(key);
			while( j>=0 && res<0)		
			{
				arr[j+1]=arr[j];
				j=j-1;
				res=l.compareTo(key);
			}
			arr[j+1]=key;
		}
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		
		}
	}
}

