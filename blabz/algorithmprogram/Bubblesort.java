package com.blabz.algorithmprogram;

public class Bubblesort {
	public static void main(String[] args) 
	{
		int a[]= {10,40,20,100,9,5};
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				 if(a[i]<a[j])  
		          {  
				 int temp = a[i];  
	             a[i]=a[j];  
	             a[j] = temp;   
	            
		          }  

			}	
			
		}
		int length = a.length-1;
		//System.out.println("max element is"+a[5]);
		
		System.out.println("sorted list is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	
		System.out.println("max element is"+a[length]);
		int p=0;
		System.out.println("minimum element is"+a[p]);
			
	}
	}



