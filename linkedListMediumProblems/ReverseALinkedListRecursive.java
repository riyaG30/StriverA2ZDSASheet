package linkedListMediumProblems;

public class ReverseALinkedListRecursive {

	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		reverseList(sl.head);
		sl.display();
	}

	 public static Node1 reverse(Node1 head,Node1 prev)
	    {
	        if(head==null)
	        {
	            return prev;
	        }
	        Node1 current=head.next;
	        head.next=prev;
	        prev=head;
	        return reverse(current,prev);
	    }
	 public static Node1 reverseList(Node1 head)
	    {
	       return reverse(head,null);
	    }

}
