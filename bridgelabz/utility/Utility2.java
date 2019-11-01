package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utility2 {
	static Scanner scanner=new Scanner(System.in);

	public  int ReadIntegers()
	{
		return scanner.nextInt();
	}
	
	public  static  String readString()
	{
		return scanner.nextLine();
	}
		public class Node<T> 
		{
			T data;
			Node<T> next;

			public Node(T d)
			{
				data = d;
				next = null;
			}
		}
		@SuppressWarnings("rawtypes")
		Node head;
		/**
		 * @Purpose - Used to add node in Unordered list
		 * @param <T>  - Generic Variable
		 * @param data - A item which user want to insert into Unordered list
		 */
		@SuppressWarnings("unchecked")
		public <T> void addUnordered(T item) 
		{
			Node<T> newNode = new Node<T>(item);
			if (head == null) 
			{
				head = newNode;
			} else 
			{
				Node<T> temp = head;
				while (temp.next != null) 
				{
					temp = temp.next;
				}

				temp.next = newNode;
			}
		}
		/**
		 * @Purpose - Used to pop item from Data Structure
		 * @param <T> - Generic Variable
		 * @return - Returns item which is present on top of Data Structure
		 */
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public <T> T pop() 
		{
			T last_item = null;
			if (isEmpty() == false) 
			{
				Node temp = head;
				if (temp.next == null) {
					last_item = (T) head.data;
					head = null;
					return last_item;
				} 
				else
				{
					if (temp.next.next == null) 
					{
						last_item = (T) head.next.data;
						head.next = null;
						return last_item;
					} 
					else 
					{
						while (temp.next.next != null) 
						{
							temp = temp.next;
						}
						last_item = (T) temp.next.data;
						temp.next = null;
						return last_item;
					}
				}
			} 
			else 
			{
				System.out.println("Data Structure is empty");
				return last_item;
			}
		}
		/**
		 * @Purpose - Used to pop item present at given position from Data Structure
		 * @param <T> - Generic Variable
		 * @return - Returns item which is present at given position from Data Structure
		 */
		@SuppressWarnings("unchecked")
		public <T> T pop(int position)
		{
			T pop_item;

			if (position == 1)
			{
				pop_item = (T) head.data;
				head = head.next;
			} 
			else
			{
				@SuppressWarnings("rawtypes")
				Node temp = head;
				for (int i = 1; i < position - 1; i++) {
					temp = temp.next;
				}
				pop_item = (T) temp.next.data;
				temp.next = temp.next.next;
			}
			return pop_item;
		}
		/**
		 * @Purpose - Get an index from data structure where given item is present
		 * @param <T> - Generic Variable
		 * @param item - Given item whose index is required
		 * @return - returns an index of item
		 */
		public <T> int index(T item) {
			int count = 0;
			if (head == null) {
				System.out.println("given LinkedList is empty");
				return count;
			} else
			{
				@SuppressWarnings("unchecked")
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
		/**
		 * @Purpose - used to search a element in linked list
		 * @param <T>  - Generic variable
		 * @param data - It is a search key
		 */
		public  <T> boolean search(T data) {

			if (head == null) {
				System.out.println("given LinkedList is empty");
				return false;
			} else {
				int count = 0;
				@SuppressWarnings("unchecked")
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
		/**
		 * @Purpose - Used to display the linked list
		 * @param <T> - Generic variable
		 */
		@SuppressWarnings("unchecked")
		public <T> void display() {
			if (head == null) {
				System.out.println("given LinkedList is empty");
			} else {
				Node<T> temp = head;
				while (temp.next != null) 
				{
					System.out.print(temp.data + "\t");
					temp = temp.next;
				}
				System.out.print(temp.data + "\t");
			}
		}
		/**
		 * @Purpose - Used to write file
		 * @path - Path where file is present
		 * @param <T> - Generic Variable
		 * @throws Exception - Used to handle file not found exception
		 */
		@SuppressWarnings("unchecked")
		public  <T> void writeIntoFile(String path) throws Exception {
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
		
		/**
		 * @Purpose - To know size of data structure
		 * @return -  returns size of data structure
		 */
		@SuppressWarnings("rawtypes")
		public int size() {
			int count = 0;
			Node temp = head;
			while (temp.next != null) {
				count++;
				temp = temp.next;
			}
			count++;
			return count;
		}
		/**
		 * @Purpose - Check whether data structure is empty or not
		 * @return - Returns true if data structure is empty else returns false
		 */
		public boolean isEmpty() {
			if (head == null) {
				return true;
			}
			return false;
		}
		/**
		 * @Purpose - Used to add node in ordered list
		 * @param <T>  - Generic Variable
		 * @param data - A item which user want to insert into ordered list
		 */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public  <T extends Comparable> void addOrdered(T item) {
			Node<T> newNode = new Node<T>(item);
			if (head == null) {
				head = newNode;
			} 
			else 
			{
				Node<T> temp = head;
				while (temp.next != null) {
					if (temp.data.compareTo(item) == 0 || temp.data.compareTo(item) > 0) {
						newNode.next = head;
						head = newNode;
						return;
					} 
					else
					{
						if (temp.data.compareTo(item) < 0 && temp.next.data.compareTo(item) >= 0) {
							newNode.next = temp.next;
							temp.next = newNode;
							return;
						}
					}
					temp = temp.next;
				}

				temp.next = newNode;
			}
		}
		/**
		 * @Purpose - To create Empty Unordered List
		 * @param <T> - Generic variable
		 * @return - Returns head of list
		 */
		@SuppressWarnings("unchecked")
		public <T> Node<T> List() {
			head = null;
			return head;
		}

		/**
		 * @Purpose - To create Empty Ordered List
		 * @param <T> - Generic variable
		 * @return - Returns head of list
		 */
		@SuppressWarnings("unchecked")
		public <T> Node<T> orderedList() {
			head = null;
			return head;
		}

		/**
		 * @Purpose - To create Empty stack
		 * @param <T> - Generic variable
		 * @return - Returns top of stack
		 */
		@SuppressWarnings("unchecked")
		public  <T> Node<T> stack() {
			head = null;
			return head;
		}

		/**
		 * @Purpose - To create Empty queue
		 * @param <T> - Generic variable
		 * @return - Returns front of queue
		 */
		@SuppressWarnings("unchecked")
		public  <T> Node<T> queue() {
			head = null;
			return head;
		}
		/**
		 * @Purpose - To create Empty queue
		 * @param <T> - Generic variable
		 * @return - Returns front of queue
		 */
		@SuppressWarnings("unchecked")
		public <T> Node<T> Deque() {
			head = null;
			return head;
		}
		/**
		 * @Purpose - Used to enqueue in Queue
		 * @param <T>  - Generic Variable
		 * @param item - Item to be enqueued
		 */
		@SuppressWarnings("rawtypes")
		public  <T> void enQueue(T item) {
			@SuppressWarnings("unused")
			Node front = head;
			addUnordered(item);
		}

		/**
		 * @Purpose - Used to dnQueue in Queue
		 * @param <T> - Generic Variable
		 */
		@SuppressWarnings("unchecked")
		public  <T> T dequeue() {
			T dnQueued_element = (T) head.data;
			head = head.next;
			return dnQueued_element;
		}
		
		/**
		 * @Purpose - Adds item at front of data structure
		 * @param <T> - Generic variable
		 * @param item - Item which will be inserted
		 */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public  <T> void addFront(T item)
		{
			Node newNode = new Node(item);
			newNode.next=head;
			head=newNode;
		}
		/**
		 * @Purpose - Adds item at rear of data structure
		 * @param <T> - Generic variable
		 * @param item - Item which will be inserted
		 */
		public  <T> void addRear(T item)
		{
			addUnordered(item);
		}
		/**
		 * @Purpose - Removes item from front of data structure
		 * @param <T> - Generic variable
		 * @return - Returns removed item
		 */
		@SuppressWarnings("unchecked")
		public  <T> T removeFront()
		{
			T item = null;
			if(isEmpty()==false)
			{
				item = (T) head.data;
				head = head.next;
				return item;
			}
			else
			{
				System.out.println("Data staructure is empty");
				return item;
			}
		}
		/**
		 * @Purpose - Removes item from rear end of data structure
		 * @param <T> - Generic variable
		 * @return - Returns removed item
		 */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public  <T> T removeRear()
		{
			T item;
			Node temp = head;
			if(isEmpty()==false)
			{
				if(temp.next==null)
				{
					item = (T) temp.data;
					head=null;
				}
				else
				{
					if(temp.next.next==null)
					{
						item = (T) temp.next.data;
						head.next=null;
					}
					else
					{
						while(temp.next.next!=null)
						{
							temp=temp.next;
						}
						item = (T) temp.next.data;
						temp.next=null;
					}
				}
			}
			else
			{
				item = null;
				System.out.println("Data structure is empty");
			}
			return item;
		}
		/**
		 * @Purpose - Used to push in Stack
		 * @param <T>  - Generic Variable
		 * @param item - Item to be pushed
		 */
		public  <T> void push(T item) {
			addUnordered(item);
		}
		
		/**
		 * @Purpose - Used to return top of stack without removing any item from stack
		 * @param <T> - Generic Variable
		 * @return - Returns item which is present on top of stack
		 */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public  <T> T peek() {
			T peek_value = null;
			if (isEmpty() == false) {
				Node temp = head;
				while (temp.next.next != null) {
					temp = temp.next;
				}
				peek_value = (T) temp.data;
			} else
				System.out.println("Data Structure is empty");
			return peek_value;
		}
		/**
		 * @Purpose - Used to insert a item at given position
		 * @param <T> - Generic Variable
		 * @param position - Position where user want insert item
		 * @param item - item which user want to insert
		 */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public  <T> void insert(int position, T item) {
			Node temp = head;
			for (int i = 0; i < position; i++) 
			{
				temp = temp.next;
			}
			Node <?>newNode = new Node<>(item);
			newNode.next = temp.next;
			temp.next = newNode;
		}

		/**
		 * @Purpose - Used to append an Unordered list
		 * @param <T> - - Generic Variable
		 * @param item - Item which will be appended
		 */
		public  <T> void appendUnordered(T item) {
			addUnordered(item);
		}
		
		/**
		 * @Purpose - Used to append an Ordered list
		 * @param <T> - - Generic Variable
		 * @param item - Item which will be appended
		 */
		public  <T extends Comparable<?>> void appendOrdered(T item) {
			addOrdered(item);
		}
		/**
		 * @Purpose - Used to remove node from linked list
		 * @param <T>    - Generic variable
		 * @param target - It points to a node which user want to remove
		 */
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public  <T> void remove(T item) {
			Node <?>target_node = head;

			while (target_node.next != null) 
			{
				if ((target_node.data).equals(item)) 
				{

					if (target_node == head) 
					{
						head = target_node.next;
						return;
					} 
					else 
					{
						Node temp = head;
						while (temp.next != null)
						{
							if (temp.next == target_node) 
							{
								temp.next = target_node.next;
								return;
							}
							temp = temp.next;
						}
					}
				}
				target_node = target_node.next;
			}
			if ((target_node.data).equals(item)) {

				
				Node temp = head;
				while (temp.next != null) {
					if (temp.next == target_node) {
						temp.next = target_node.next;
						return;
					}
					temp = temp.next;
				}
			}
		}
		public void addToHashTable(Utility2 table[], int item)
		{
			int pushed_item, poped_item, slot = item % 11;
			if (table[slot] == null)
				table[slot] = new Utility2();

			if (table[slot].search(item))
			{
			
				poped_item = (int) table[slot].pop(table[slot].index(item));
				System.out.println(poped_item + " is poped");
			} 
			else 
			{
				pushed_item = item;
				
				table[slot].addUnordered(item);
				System.out.println(pushed_item + " is pushed");
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
	public static int dayofweek(int day,int month,int year)	
	{
		double y0 = (year - (14 - month) / 12);
        double x = y0 + y0/4 - y0/100 + y0/400;
        double m = month + 12 * ((14 - month) / 12) - 2;
        double d = (day + x + (31*m)/12) % 7;
        return (int) d;
	}
	
	public static int enddate(int month,int year)
	{
		int[]month_days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int end_date;
		if(month==2 && year%4==0)
		{
			 month_days[month-1]=29;
		}
		end_date=month_days[month-1];
		return end_date;
	}
	}
