package com.blabz.datastructure;

import java.util.Arrays;

import com.blabz.Utility.Utility;

public class AngramTwoDim {
	public static void main(String[] args) {
		
		int prime[]=Utility.primeno();
		Anagram(prime);
		
	}
	public static void Anagram(int arr[])
	{
		String arr1[][]=new String[arr.length][arr.length];
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				String str1=String.valueOf(arr[i]);
				String str2=String.valueOf(arr[j]);
				
				char c1[]=str1.toCharArray();
				char c2[]=str2.toCharArray();
				
				Arrays.sort(c1);
				Arrays.sort(c2);
				
				if(Arrays.equals(c1, c2))
				{
					arr1[i][j]=str1+" "+str2;
					
				}
			}
			
		}
		
		
	}	
}
