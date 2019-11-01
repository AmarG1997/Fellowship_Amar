package com.blabz.datastructure;

import com.bridgelabz.utility.Utility2;

public class Calendarusingqueue {
@SuppressWarnings("static-access")
public static void main(String[] args) 
{
	Utility2 utility=new Utility2();
	System.out.println("Enter Month");
	int month=utility.ReadIntegers();
	System.out.println("Enter Year");
	int year=utility.ReadIntegers();
	
	int enddate=utility.enddate(month, year);
	int day=utility.dayofweek(1, month, year);
	int x=1;
	for(int i=0;i<=42;i++)
	{
		if(i==day && x<=enddate)
		{
			utility.enQueue(x);
			++x;
			++day;
		}
		else
		{
			utility.enQueue(0);
		}
	}
	System.out.print("  Sun Mon Tue Wed Thu fri Sat");
	int Dequeueitem;
	for (int i = 0; i < 6; i++)
	{
		System.out.println();
		for (int k = 0; k < 7; k++)
		{
			
			Dequeueitem = (int) utility.dequeue();
			if (Dequeueitem!= 0) 
			{
				System.out.printf("%4d", Dequeueitem);
			} 
			else
			{
				System.out.print("    ");
			}
		}
	}
}

	
}

