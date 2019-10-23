package com.blabz.Utility;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




/**
 * @author Amar A.Gunjal
 *
 */
@SuppressWarnings("unused")
public class Utility {
	static Scanner scanner=new Scanner(System.in);
	public  int ReadIntegers()
	{
		return scanner.nextInt();
	}
	
	public  static  String readString()
	{
		return scanner.nextLine();
	}

	/**
	 * @param n= how many time u want to bets
	 * @param cash= how many amount u have
	 * @param goal= upto how much amount u will playing
	 */
	public static void Gambling(int n,int cash,int goal)
	{
		double wins=0;
		 double loss=0;
		 double Winp=0;
		 double Lossp=0;
		while(cash>0||cash<goal)
		{
			for(int i=0;i<n;i++)
			{
			
				if(Math.random()<0.5)
				{
					wins++;
					cash++;
				}
				else
				{
					loss++;
					cash--;
				}
			}
			break;
		}
		System.out.println("Wins ="+wins);
		System.out.println("loss ="+loss);
		 Winp=(wins/n)*100;
		System.out.println("Wins Percentage:"+Winp);
		Lossp=(loss/n)*100;
		System.out.println("Loss Percentage:"+Lossp);
		System.out.println("cash is="+cash);
	}
	
	
	/**
	 * @param n=how many coupon u want to generate
	 * @return hs
	 */
	
	@SuppressWarnings("rawtypes")
	public static HashSet Coupon(int n)
	{
		@SuppressWarnings("unchecked")
		HashSet <String>hs=new <String> HashSet();
		 char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
	        String sb = new String("");
	       
	        Random random = new Random();
	     
	        for(int j=0;j<n;j++)
	        {
	        for (int i = 0; i < 10; i++) {
	            char c = chars[random.nextInt(chars.length)];
	            sb=sb+c;
	        }
		        hs.add(sb);
	        	sb="";
	        }
	       return hs;
	}
	
	/**
	 * @param n1 for start the stopwatch
	 * @param n2 for stop the stopwatch
	 */
	public static void StopWatch(int n1,int n2)
	{
		double startTime=0;
		double stopTime=0;
		if(n1==1)
		{
			startTime=System.currentTimeMillis();
		}
		else if(n2==2)
		{
			stopTime=System.currentTimeMillis();
		}
		double ET=0;
		ET=(stopTime-startTime)/1000;
		System.out.println("Elapsed Time="+ET);
	}
	
	public static void Vending(int Amount )
	{
		int notes[]= {2000,1000,500,200,100,50,20,10};
		int rem=0;
		for(int i=0;i<notes.length;i++)
		
		{
		if(Amount>notes[i])
		{
		rem=Amount/notes[i];
		Amount=Amount%notes[i];
		}
	
	}
	}	
	
	/**
	 * @return current date is taking the current system date and time
	 */
	
	public  static String currentdate()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		String date = String.valueOf(now);
		
		return date;
	}
	
	/**
	 * @param str its passed the array
	 * @param name it is pass the name
	 * @return
	 */
	public static String[] Regexstring(String[] str,String name)
	{
		try {
			
		      Pattern patternstring = Pattern.compile("^[a-zA-Z]*$");
		      Matcher matcherstringname = patternstring.matcher(name);
		      
		      if(matcherstringname.matches()==true)
		      {
		    	  for (int i = 0; i < str.length; i++)
		  		{
		  			if (str[i].matches("<<name>>"))
		  			{
		  				if (matcherstringname.matches() == true)
		  				{
		  					str[i] = name;
		  				}
		  			}
		  			
		  		}
		      }
		      else {
		    	  System.out.println("only string  is allow");
		    	  System.exit(0);
		      }
		}
		catch(Exception e)
		{
			System.out.println("Enter name is String");
		}
		
		return str;
		
	}
	/**
	 * @param str=passing the array
	 * @param name its pass the full name
	 * @return
	 */
	public static String[] Regexstringfull(String[] str,String name)
	{
		try {
			
		      Pattern patternstring = Pattern.compile("^([A-z\\'\\.-ᶜ]*(\\s))+[A-z\\'\\.-ᶜ]*$");
		      Matcher matcherstringname = patternstring.matcher(name);
		      
		      if(matcherstringname.matches()==true)
		      {
		    	  for (int i = 0; i < str.length; i++)
		  		{
		  			if (str[i].matches("<<fullname>>"))
		  			{
		  				if (matcherstringname.matches() == true)
		  				{
		  					str[i] = name;
		  				}
		  			}
		  			
		  		}
		      }
		      else {
		    	  System.out.println("only string  is allow");
		    	  System.exit(0);
		      }
		}
		catch(Exception e)
		{
			System.out.println("Enter name is String");
		}
		
		return str;
		
	}
	
	
	
	/**
	 * @param str passing the array
	 * @param moible it is used for mobile and function is only take the numbers
	 * @return
	 */
	public static String[] Regexstringmoible(String[] str,String moible)
	{
		try {
			
			Pattern patternsmoible = Pattern.compile("(0/91)?[7-9][0-9]{9}");
			Matcher matchermoible = patternsmoible.matcher(moible);
		      
		      if(matchermoible.matches()==true)
		      {
		    	  for (int i = 0; i < str.length; i++)
		  		{
		  			if (str[i].matches("xxxxxxxxxx"))
		  			{
		  				if (matchermoible.matches() == true)
		  				{
		  					str[i] = moible;
		  				}
		  			}
		  			
		  		}
		      }
		      else {
		    	  System.out.println("Enter only  10 digit  number");
		    	  System.exit(0);
		      }
		}
		catch(Exception e)
		{
			System.out.println("Enter name is Number");
		}
		
		return str;
		
	}
	
	/**
	 * @param str passing the array,,& it is used for date function
	 * @return
	 */
	public static String[] regexdate(String[] str)
	{
		try {
			
			String date = Utility.currentdate();
			for (int i = 0; i < str.length; i++) 
			{
				if (str[i].matches("01/01/2016")) 
				{

					str[i] = date;

				}

			}
		}
		catch(Exception e)
		{
			System.out.println("Enter correct date");
			System.exit(0);
		}
		
		return str;
		
	}
	
	
	/*************DATA STRUCTURE PROGRAMS
	 * @return ***************/
	
	/**
	 * @author Amar A.Gunjal
	 *
	 * @param <T> is is used for taking all types of data
	 */
	public static class Node<T>
	{
		T data;
		Node<T>next=null;
		Node<T>prev=null;
		
		Node(T d)
		{
			data=d;
		}
	}
	
	@SuppressWarnings("rawtypes")
	static Node top=null;
	@SuppressWarnings("rawtypes")
	static Node head=null;
	@SuppressWarnings("rawtypes")
	static Node front=null;
	@SuppressWarnings("rawtypes")
	static Node rear=null;
	
	/**
	 * @param <T> to accept all types of data
	 * @param d its data which you want to add
	 * @return null
	 */
	@SuppressWarnings("unchecked")
	/*****to insert the data in linked list**/
	
	public static <T> T add(T d)
	{
		Node <T> newNode=new Node <T>(d);
		if(head==null)
		{
			
			head=newNode;
		}
		else
		{
			@SuppressWarnings("rawtypes")
			Node temp=head;
			while(temp.next!=null)
			{
				 temp=temp.next;
			}
			temp.next=newNode;
			
		}
		return d;
		
	}
	@SuppressWarnings("rawtypes")
	
	/*to display the linked list */
	public static <T> void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	/**
	 * TO insert data into first position
	 * 
	 * @param <T>to access all types of data
	 * @param d=data that you want to insert at first position
	 * @return
	 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T inserFirst(T d)
	{
		Node newNode=new Node(d);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node first=head;
			head=newNode;
			head.next=first;
		}
		
		return d;
	}
	
	/**
	 * To insert last in the linked list 
	 * 
	 * @param <T> To access all types of data
	 * @param d =data which you want to insert
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> T insertLast(T d)
	{
		Node newNode=new Node(d);
		Node temp=head;
		
		while(temp.next!=null)
		{
			 temp=temp.next;
		}
		temp.next=newNode;
		return d;
	}
	
	/**
	 * To delete the first element in the linked list
	 * 
	 * @param <T> to access all types of data
	 */
	public static <T> void deleteFirst()
	{
		head=head.next;
	}
	
	/**
	 * To delete the last element in the linked list
	 * 
	 * @param <T> To access all types of data
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> void deleteLast()
	{
		Node temp = head;
		Node temp1=null;
		if(temp==null)
		{
			System.out.println("Empty queue");
		}
		else
		{
			if(temp.next==null)
			{
				temp1 = temp;
				front=null;
			}
			else
			{
				if(temp.next.next==null)
				{
					temp1 = temp.next;
					temp.next=null;
				}
				else
				{
					while(temp.next.next!=null)
					{
						temp=temp.next; 
					}
					temp1 =  temp.next;
					temp.next = null;
				}
			}
		}
			
	}
	
	
	/**
	 * to insert data into linkedlist at specific position
	 * 
	 * @param <T> to access all types of data
	 * @param d data which you want to insert
	 * @param pos at which position you want to insert data
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T insertAtPos(T d,int pos)
	{
		Node <T> newNode=new <T> Node(d);
		if(pos==0)
		{
			Node first=head;
			head=newNode;
			head.next=first;
		}
		else
		{
			Node start = head;
		    for (int i=0; i<pos-1; i++) 
		    {
		       start= start.next;
		    }
		     newNode.next = start.next;
		    start.next = newNode;
		 }
		return null;	
	}
		
	/**
	 * to delete element from linked list at specific position
	 * 
	 * @param <T> to aceess all types of data
	 * @param pos on which position u want to delete data
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> void deleteAtPos(int pos)
	{
		if(pos==0)
		{
			head=head.next;
		}
		else
		{
			Node start=head;
			for (int i=0; i<pos-1; i++) 
			{
				  start = start.next;
			}	      
	        Node next = start.next.next; 
	        start.next = next;
		}
		
	}
	
	/**
	 * 
	 * to check that the linked list is empty or not
	 * @param <T>
	 */
	public static <T> void isEmpty()
	{
		if(head==null)
		{
			System.out.println("LinkedList is empty");
		}
		else
		{
			System.out.println("LinkedList is not empty");
		}
	}
	/**
	 * 
	 * to add data into stack
	 * @param <T>it is used for all types of data
	 * @param d it is data which is entered by user for push
	 * @return nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T> T stackpush(T d)
	{
		Node <T> newNode=new Node <T>(d);

		if(top==null)
		{
			//top=newNode;
		}
	
		newNode.data=d;
		newNode.next=top;
		top=newNode;
		System.out.println("top"+top.data);
		return null;
		
	}
	
	/**
	 * 
	 * to delete data from stack
	 * @param <T>it is used for all types of data
	 * @return nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T> T stackpop()
	{
		if(top.data==null)
	{
			System.out.println("Stack is empty");
	}
		T res= (T) top.data;
		top=top.next;
		System.out.println("Popped element is"+res);
		return (T) top;
		
	}
	/**
	 * 
	 *to take the top element from the stack
	 * @param <T> used for all types of data
	 * @return 
	 * **** this function peek the top value in the list
	 */
	@SuppressWarnings("unchecked")
	public static <T> T stackpeek()
	{
		T res1=(T) top.data;
		System.out.println("Top Element is="+res1);
		return res1;
		
	}
	/**
	 * to display the stack
	 * @param <T> display all types of data
	 */
	@SuppressWarnings("unchecked")
	public static <T> void stackdisplay()
	{
            Node<T> temp = top; 
            
            while (temp != null)
            { 
                System.out.println(temp.data); 
 
                temp = temp.next; 
            } 
            
        
     
	}
	/**
	 * to display the stack
	 * @param <T>display all types of data
	 * 
	 * it is used for count the stack size
	 */
	@SuppressWarnings("unchecked")
	public static <T> void stacksize()
	{
		int count=0;
		Node<T> temp=top;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		System.out.println("size of stack is:"+count);
	}
	
	/**
	 * 
	 * to check that stack is empty or not
	 * @param <T>
	 * @return true or false
	 */
	public static <T> boolean stackisEmpty()
	{
		
		if(top==null)
            {return true;	}	
	  return false;
	}
	
	/**
	 * to add data from front side into the queue
	 * 
	 * @param <T>
	 * @param d data which u want to add into queue from the front side
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> String enqueueFront(T d)
	{
		Node <T> newNode =new Node <T>(d);
		if(rear==null)
		{
			front=newNode;
			rear=newNode;
			
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}

		
//		System.out.println("front"+front.data);
//		System.out.println("rear"+rear.data);
		return null;
		
		
	}
	
	/**
	 * to display the queue data
	 */
	@SuppressWarnings("rawtypes")
	public static void queuedisplay()
	{
		Node n=front;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	/**
	 * 
	 * to delete the data from front side in the queue
	 * @param <T>
	 */
	public static <T> void dequeueFront()
	{
		System.out.println("dequeFront=  "+front.data);

		front=front.next;
	}
	
	/**
	 * to delete data from the rear side of the queue
	 * @param <T>
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> T dequeueRear()
	{
		T ContentOfNode = null;
		Node temp = front;
		if(temp==null)
		{
			System.out.println("Empty queue");
		}
		else
		{
			if(temp.next==null)
			{
				ContentOfNode = (T)temp.data;
				front=null;
			}
			else
			{
				if(temp.next.next==null)
				{
					ContentOfNode = ( T) temp.next.data;
					temp.next=null;
				}
				else
				{
					while(temp.next.next!=null)
					{
						temp=temp.next; 
					}
					ContentOfNode = (T) temp.next.data;
					temp.next = null;
				}
			}
		}
		
		return ContentOfNode;
		
		

	}
	
	/**
	 * to check that queue is empty or not
	 * @param <T>
	 */
	public static <T> void queueisEmpty()
	{
		if(front==null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue is not empty");
		}
	}
	
	/**
	 * to check the queue size or how mant elements are present into the queue
	 * @param <T>
	 */
	@SuppressWarnings("unchecked")
	public static <T> void queueSize()
	{

		int count=0;
		Node<T> temp=front;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		System.out.println("size of queue is:"+count);
	}
	
	/**
	 * 
	 * to add the data into queue from the rear side
	 * @param <T>
	 * @param d=data which want to add into the queue from rear side
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static <T> void enqueueRear(T d)
	{
		Node newNode=new Node(d);
		Node oldRear=rear;
		rear=newNode;
		rear.data=d;
		rear.next=null;
		if(front==null)
		{
			front=rear;
		}
		else
		{
			oldRear.next=newNode;
		}
		System.out.println("front="+front.data);
		System.out.println("rear="+rear.data);
	}


	/**
	 * 
	 * to check that the string is balanced or not 
	 * @param <T>
	 * @param str1 its string that we have to check
	 * @return
	 */
	public static <T> boolean stringBalancedParanthesis(String str1)
	{
		
		char arr[]=str1.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			if(arr[i]=='('||arr[i]=='+')
			{
				Utility.stackpush(arr[i]);
			}
		}
		for(int i=0;i<str1.length();i++)
		{
			if(arr[i]==')')
			{
				if(Utility.stackisEmpty())
			{
					//Utility.stackpush();
				}
				else {
				Utility.stackpop();
				}
			}
		}
		
		
		if(Utility.stackisEmpty()==false)
		{
			
			return true ;
			

		}
		else
			
			return false;
		
	}
	public static int calculateDay(int day,int month,int year)
	{
		
		double y0 = (year - (14 - month) / 12);
        double x = y0 + y0/4 - y0/100 + y0/400;
        double m = month + 12 * ((14 - month) / 12) - 2;
        double d = (day + x + (31*m)/12) % 7;
        return (int) Math.round(d);
	}
	
	public static boolean isLeapYear(int year)
	{
		if((year%100!=0 && year%4==0)||(year%400==0))
			return true;
		else
			return false;
	}
	public static void calendar1(String cal[] [],int d,int days[],int m)
	{
		
		int tempDay = 0;
		for (int i = 0; i < cal.length; i++) 
		{
			for (int j = 0; j < cal[i].length; j++) 
			{
				if (!(i == 0 && j < d))
				{
					if (tempDay <= days[m]) 
					{
						tempDay++;                                                                                      
						if (tempDay < 10) 
						{
							cal[i][j] = "   " + tempDay;
						} else 
						{
							cal[i][j] = "  " + tempDay;
						}
					} 
					else 
					{
						break;
					}
				}

			}
		}

		
	tempDay = 0;
	for (int i = 0; i < cal.length; i++) 
	{
		for (int j = 0; j < cal[i].length; j++) 
		{
			if (days[m] >= tempDay) 
			{
				tempDay++;
				System.out.print(cal[i][j]);
			} 
			else 
			{
				break;
			}

		}
		System.out.println();
	}

	}
	
	/** 
	 *@purpose to deposit the money
	 * @param n its amount that we have to deposit
	 * @param balance =its current balance which is available
	 * @return
	 */
	public static long deposit(long n,long balance)
	{
		
		 balance=balance+n;
		System.out.println("Current Balance:"+balance);
		
		return balance;
		
	}
	
	/**
	 * 
	 * @purpose to withdraw the amount
	 * @param n the amount that we want to withdraw
	 * @param balance available balance
	 * @return
	 */
	public static long withdraw(long n,long balance)
	{
		if(balance>=n)
		{
			balance=balance-n;
			System.out.println("Current bal="+balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		return balance;
	}
	
	
	public static  int[] primeno()
	{
			int count;
	        int prime[]=new int[169];
	        int size=0;
	        int n=1000;
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
						//System.out.println(j);   

					   prime[size]=j;
					   size++;
					  
				   }
				   
				   
			 }
//			 for(int i=0;i<=prime.length-1;i++)
//			   {
//				   System.out.println(prime[i]);
//			   }
			
			 return prime;
	}
		


	
	/**
	 * to check that the enter string is palindrome or not
	 * @param s string 
	 */
	public static void palindromeChecker(String s)
	{
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			Utility.enqueueFront(arr[i]);
		}
		//Utility.queuedisplay();
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			flag=false;
			String a = String.valueOf(arr[i]);
			if(a.equals(Utility.dequeueRear().toString()))
			{
				flag=true;
				continue;
			}
		
			
		}
		if (flag==true)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

		public static String[] readFile(String path) throws IOException {
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String[] content_of_file = null;

		while ((st = br.readLine()) != null) {
			content_of_file = st.split(" ");
		}
		br.close();
		return content_of_file;
	}
	
		
		public static <T> void writeIntoFile(String path) throws Exception {
			FileWriter fileWriter = new FileWriter(path);
			fileWriter.flush();
			BufferedWriter write = new BufferedWriter(fileWriter);
			if (head == null) {
				write.close();
				return;
			} else {
				Node<T> temp = head;
				while (temp.next != null) {
					write.write((temp.data + " ").toString());
					temp = temp.next;
				}
				write.write((temp.data + " ").toString());
			}
			write.close();
		}

		public void addToHashTable(Utility table[], int item) {
			int pushed_item, poped_item, slot = item % 11;
			if (table[slot] == null)
				table[slot] = new Utility();

			if (table[slot].search(item)) {
				pushed_item = 0;
				System.out.println();
				poped_item = (int) table[slot].pop(table[slot].index(item));
				System.out.println(poped_item + " is poped");
			} else {
				pushed_item = item;
				poped_item = 0;
				table[slot].addUnordered(item);
				System.out.println(pushed_item + " is pushed");
			}
		}
		public  <T> boolean search(T data) {

			if (head == null) {
				System.out.println("given LinkedList is empty");
				return false;
			} else {
				int count = 0;
				Node<T> temp = head;
				while (temp.next != null) {
					count++;
					if ((temp.data).equals(data)) {
						System.out.println("Given item is present in LinkedList at position " + count);
						return true;
					}
					temp = temp.next;
				}
				count++;
				if ((temp.data).equals(data)) {
					System.out.println("Given item is present in LinkedList at position " + count);
					return true;
				} else {
					System.out.println("Given item is not present in LinkedList");
					return false;
				}

			}
		}
		
		public static <T> void addUnordered(T item) {
			Node<T> newNode = new Node<T>(item);
			if (head == null) {
				head = newNode;
			} else {
				Node<T> temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}

				temp.next = newNode;
			}
		}
		
		public static <T> int index(T item) {
			int count = 0;
			if (head == null) {
				System.out.println("given LinkedList is empty");
				return count;
			} else {
				Node<T> temp = head;
				while (temp.next != null) {
					count++;
					if ((temp.data).equals(item)) {
						return count;
					}
					temp = temp.next;
				}
				count++;
				if ((temp.data).equals(item)) {
					return count;
				} else {
					count = 0;
					return count;
				}

			}
		}

		public  static<T> T pop(int position) {
			T pop_item;

			if (position == 1) {
				pop_item = (T) head.data;
				head = head.next;
			} else {
				Node temp = head;
				for (int i = 1; i < position - 1; i++) {
					temp = temp.next;
				}
				pop_item = (T) temp.next.data;
				temp.next = temp.next.next;
			}
			return pop_item;
		}
}
