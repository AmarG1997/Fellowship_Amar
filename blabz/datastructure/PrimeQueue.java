package com.blabz.datastructure;

import java.util.Arrays;

import com.blabz.Utility.Utility;

public class PrimeQueue {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Utility utility=new Utility();
		int n=1000;
		int count;
		int arr[]=new int[168];
		int size=0;
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			(arr[size])=j;
				size++;
			}
			
		}
		anagram(arr);
	}
	public static void anagram(int arr[])
	{
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
					Utility.enqueueFront(str2);
					//System.out.println(str2);
				}
			}
			
			
		}
			Utility.queuedisplay();
	}
	}

