package com.blabz.datastructure;

import java.util.Arrays;

import com.blabz.Utility.Utility;

public class Primestack {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Utility utility=new Utility();
		int count;
		int n=1000;
		int size=0;
		int arr[]=new int[169];
		System.out.println("Anagram numbers in stack");
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
				
				arr[size]=j;
				size++;
				
			}
			
		}
		

		
		anagram(arr);
		
	}
	public static void anagram(int arr[])
	{

		String str1,str2;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				str1=String.valueOf(arr[i]);
				str2=String.valueOf(arr[j]);
				
				char [] c1=str1.toCharArray();
				char [] c2=str2.toCharArray();
				
				Arrays.sort(c1);
				Arrays.sort(c2);
				
			if(Arrays.equals(c1, c2))
				{
					//System.out.println(str1+"  "+str2);
				Utility.stackpush(str2);
				
				
				}
			
			
			}
		}
		Utility.stackdisplay();
	}

}
