package linkedListMediumProblems;


public class ReverseALinkedListIterative {
	public static Node1 reverseList(Node1 head)
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
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		sl.head=reverseList(sl.head);
		sl.display();

	}

}
