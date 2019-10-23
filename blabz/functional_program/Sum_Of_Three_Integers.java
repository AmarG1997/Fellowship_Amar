package com.blabz.functional_program;

public class Sum_Of_Three_Integers {
	public static void main(String[] args) {
		
		int a[]= {-1,-1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10-2;i++)
		{
		for(int j=i+1;j<10-1;j++)
		{
			for(int k=j+1;j<10;j++)
			{
				if(a[i]+a[j]+a[k]==0)
				{
					System.out.println("i="+a[i]+"j="+a[j]+"k="+a[k]);
				}
			}
		}
	}
	}
}
