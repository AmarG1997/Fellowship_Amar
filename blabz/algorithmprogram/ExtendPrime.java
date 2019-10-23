package com.blabz.algorithmprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtendPrime {
	public static void main(String[] args) {
		int n=1000;
		int i,count;
		int arr[]=new int[169];
		int size=0;
	
		//System.out.println("Prime numbers between o to "+n+" ");
		System.out.println("prime numbers which are palindrme is:-");
		for(int j=2;j<=n;j++)
		{
		count=0;
		for(i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2)
		{
		      // System.out.print(j+"  ");     
		       palindrome(j);
		       
		       arr[size]=j;
		       size++;
		       
		}
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println("Prime  numbers which are Anagram is");
		Anagram(arr);
	}
	
	public static void palindrome(int n)
	{
		int num=n,sum=0,temp;
		
		while(n>0)
		{
			temp=n%10;
			sum=sum*10+temp;
			n=n/10;
			
		}
		
		if(sum==num)
		{
			System.out.println(num);
		}
	}

public static void Anagram(int arr[])

{
	

     String str1,str2;
     
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		  str1=String.valueOf(arr[i]);
    		  str2=String.valueOf(arr[j]);
    		  
    		  char[] ch1=str1.toCharArray();
    		  char[] ch2=str2.toCharArray();
    		  Arrays.sort(ch1);
    		  Arrays.sort(ch2);
    		  if(Arrays.equals(ch1, ch2))
    		  {
    			  
    			  System.out.println(str1+ " "+str2);
    		  }
    	 }
     }
	
}
}