package linkedListMediumProblems;


public class CheckForPalindrome {
	 static Node1 reverseList(Node1 head)
	    {
		 Node1 prev=null;
		 Node1 current=head;
		 Node1 next=null;
	        if(current!=null)
	            next=current.next;
	        while(current!=null)
	        {
	            current.next=prev;
	            prev=current;
	            current=next;
	            if(next!=null)
	                next=next.next;
	        }
	        return prev;
	    }
	 static Node1 getMiddle(Node1 head)
	    {
		 Node1 fast=head,slow=head;
	        while(fast!=null && fast.next!=null)
	        {
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }
	    static boolean isPalindrome(Node1 head) 
	    {
	    	Node1 mid=getMiddle(head);
	    	Node1 secondHead=reverseList(mid);
	        while(head!=null && secondHead!=null)
	        {
	            if(head.data!=secondHead.data)
	                return false;
	            head=head.next;
	            secondHead=secondHead.next;
	        }
	        //Sometimes values may be remaining
	       
	        return false;
	    }   
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(5);
		sl.insertFirst(2);
		sl.insertFirst(6);
		sl.insertLast(2);
		sl.insertLast(1);
		sl.display();
		System.out.println(isPalindrome(sl.head));

	}

}
