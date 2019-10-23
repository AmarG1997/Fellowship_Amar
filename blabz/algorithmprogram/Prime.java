package com.blabz.algorithmprogram;

public class Prime {
public static void main(String[] args) {
	int n=1000;
	int i,count;
	System.out.println("Prime numbers between o to "+n+" ");
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
	       System.out.print(j+"  ");     
	}
	}

}
}
