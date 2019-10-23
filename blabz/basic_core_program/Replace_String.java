package com.blabz.basic_core_program;

import java.util.Scanner;

public class Replace_String {
public static void main(String[] args) {
	String [] str= {"Hello ","<<username>>",",","How Are You?"};
	System.out.println("Enter User Name");
	Scanner scanner=new Scanner(System.in);
	String s=scanner.nextLine();
	int position=0;
	for(int i=0;i<str.length;i++)
	{
		if(str[i]=="<<username>>")
		{
			position=i;
		}
	}
	str[position]=s;
	for(int i=0;i<str.length;i++)
	{
		System.out.print(str[i]);
	}
}
}
