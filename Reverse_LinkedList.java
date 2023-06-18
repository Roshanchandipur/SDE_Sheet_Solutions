import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        if(head==null || head.next==null) return head;
		LinkedListNode<Integer> p, c, n;
		p = null;
		c = head;
		n = head.next;
		while(n!=null){
			c.next = p;
			p = c;
			c = n;
			n = n.next;
		}
		c.next = p;
		return c;
    }
}