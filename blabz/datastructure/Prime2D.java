package com.blabz.datastructure;

import com.blabz.Utility.Utility;

public class Prime2D {
@SuppressWarnings({ "static-access", "unused" })
public static void main(String[] args) 
{
	Utility utility=new Utility();
	
	int prime[]=utility.primeno();
	
//	for(int i=0;i<prime.length;i++)
//	{
//		System.out.println(prime[i]);
//	}
	int arr[][]=new int[10][169];
	 
	for(int i=0;i<10;i++)
	{
	//	System.out.println("Between"+i+"to"+100);
		for(int j=0;j<169;j++)
		{
			
			if(prime[j]>(i)*100 && prime[j]<(i+1)*100 )
			{
				arr[i][j]=prime[j];
				System.out.print(arr[i][j]+" ");
				
			}
		
		}
		System.out.println();

	}
	
	
}
}
