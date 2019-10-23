package com.blabz.algorithmprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary
{
public static void main(String[] args) throws IOException {
	File file=new File("/home/bridgeit/Documents/bin.txt");
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);

	
	String str="";
	String n;
	 while ((n = br.readLine()) != null)
	 {
	
	   str=str+n+" ";	
	
	 }
	 String[] str1=str.split(" ");
	for(int i=0;i<str1.length;i++)
	{
		System.out.print(str1[i]+" ");
		
	
	}
	System.out.println();
	binary(str1);
	
	}
public static void binary(String arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		
		System.out.print(arr[i]+" ");
		
	}
	int first=0;
	int last=arr.length-1;
	String key="Mayur";
	int mid=(first+last)/2;
	while(first<=last)
	{
		int res=key.compareTo(arr[mid]);
		if(res<0)
		{
			first=mid+1;
		}
		else if(res==0)
		{
			System.out.println();
			System.out.println("Key is at position"+mid);
			break;
		}
		else
		{
			last=mid-1;
		}
		mid=first+last/2;
		
	}
	if(last<first)
	{
		System.out.println();
		System.out.println("key is not present");
	}
}
}
