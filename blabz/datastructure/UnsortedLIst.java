package com.blabz.datastructure;

public class UnsortedLIst {
	@SuppressWarnings("rawtypes")
	public Node head;  // head of list 
	  
  
    class Node <T>
    { 
      T data; 
        Node <T> next; 
        Node(T d)
        {
        	data = d; 
        	next = null; 
        }
	
	
    } 
  
    /* Inserts a new Node at front of the list. */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> void push(T new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
    public void printList() 
    { 
        @SuppressWarnings("rawtypes")
		Node temp = head; 
        while (temp != null) 
        { 
            System.out.println(temp.data+" "); 
            temp = temp.next; 
        } 
    } 
    @SuppressWarnings("rawtypes")
	public  int searchWord(Node head,String w)
    {
    	Node temp=head;
    	int pos=0;
     while(temp!=null)
		{
    	 if( w.compareTo((String) temp.data)==0)
    	 {	   
    		return pos;
    	 }
    	pos++;
    	 temp=temp.next;
		}
     return -1;
		
    }
   @SuppressWarnings({ "rawtypes", "unchecked" })
public void deleteNode(int position) 
    { 
        // If linked list is empty 
        if (head == null) 
            return; 
  
        // Store head node 
        Node temp = head; 
  
        // If head needs to be removed 
        if (position == 0) 
        { 
            head = temp.next;   // Change head 
            return; 
        } 
  
        // Find previous node of the node to be deleted 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
  
    
        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
        Node next = temp.next.next; 
  
        temp.next = next;  // Unlink the deleted node from list 
    } 
  @SuppressWarnings("rawtypes")
  public  String toString()
  {
       String result = "";
       Node current = head;
       while(current!= null){
           result =result+current.data+" ";
          
           current = current.next;
       }
       return  result;


  }

	
	
}




