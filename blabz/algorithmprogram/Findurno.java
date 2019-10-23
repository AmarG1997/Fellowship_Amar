package com.blabz.algorithmprogram;

import java.util.Scanner;

public class Findurno {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int low=0, high=100,mid;
	while(low!=high)
	{
	mid=(low+high)/2;
	System.out.println("enter 1 if no is between "+low+"-"+mid);
	System.out.println("enter 2 if no is between "+(mid+1)+"-"+high);
	int ch=scanner.nextInt();
	//mid=(low+high)/2;
	if(ch==1)
	{
		high=mid;
		
	}
	else
	{
		low=mid+1;
	}

	}
	System.out.println("guess number"+low);
}
}
