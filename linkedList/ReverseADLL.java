package linkedList;

public class ReverseADLL {
	public static Node reverseDLL(Node head)
	{
	    Node previous=null;
	    Node current=head;
	    Node next=null;
	    if(current!=null)
	        next=current.next;
	    while(current!=null)
	    {
	        current.next=previous;
	        current.prev=next;
	        previous=current;
	        current=next;
	        if(next!=null)
	            next=next.next;
	    }
	    return previous;
	}
	public static void main(String[] args) {
		DoublyLinkedList sl=new DoublyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		sl.head=reverseDLL(sl.head);
		sl.display();
	}

}
