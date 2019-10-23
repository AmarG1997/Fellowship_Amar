package com.blabz.datastructure;

import com.blabz.Utility.Utility;

public class LinkedList {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	Utility utility=new Utility();
	int ch;
	do
	{
		System.out.println("1.Add");
		System.out.println("2.InsertFirst");
		System.out.println("3.InsertLast");
		System.out.println("4.Delete First");
		System.out.println("5.Delete Last");
		System.out.println("6.Insert At Pos");
		System.out.println("7.Delete At Pos");
		System.out.println("8.isEmpty");
		System.out.println("9.Display");
		System.out.println("Enter Your Choice");
		ch=utility.ReadIntegers();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter data ");
			int element=utility.ReadIntegers();
			utility.add(element);
			break;
			
		case 2:
			System.out.println("Enter Data");
			int element1=utility.ReadIntegers();
			utility.inserFirst(element1);
			break;
			
		case 3:
			System.out.println("Enter Data");
			int element2=utility.ReadIntegers();
			utility.insertLast(element2);
			
		case 4:
			utility.deleteFirst();
			
		case 5:
			utility.deleteLast();
			
		case 6:
			System.out.println("Enter Data");
			int element3=utility.ReadIntegers();
			System.out.println("Enter position");
			int pos=utility.ReadIntegers();
			utility.insertAtPos(element3,pos);
			
		case 7:
			System.out.println("Enter Position which u want to delete");
			int pos1=utility.ReadIntegers();
			utility.deleteAtPos(pos1);
			
		case 8:
			utility.isEmpty();
			
		case 9:
			utility.display();
			break;
		
		
		default:
			System.out.println("Invalid Choice");
			
		}
	}while(ch!=10);
	
	
}
}
