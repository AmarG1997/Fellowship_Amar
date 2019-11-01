package com.blabz.datastructure;

import java.io.IOException;

import com.blabz.Utility.Utility;

public class PrimeeTwoDim {
	public static void main(String[] args) throws IOException
	{
		Utility utility = new Utility();
		int prime[] = utility.primeno();
//		for(int i=0;i<prime.length;i++) 
//			{
//				System.out.println(prime[i]);
//			}
		int arr[][]=new int[10][168];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<168;j++)
			{
				if(prime[j]>((i)*100)&&prime[j]<((i+1))*100)
				{
					arr[i][j]=prime[j];
					System.out.print(" "+arr[i][j]);
				}
				
		}
			System.out.println();
		}
	}
}
