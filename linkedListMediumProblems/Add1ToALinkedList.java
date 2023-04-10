package linkedListMediumProblems;


public class Add1ToALinkedList {

	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(9);
		sl.insert(9,2);
		sl.display();
		sl.head=reverse(sl.head);
		sl.display();
		Node1 temp=sl.head;
		int carry=0;
		while(temp!=null)
		{
			if(temp==sl.head)
				temp.data= temp.data+1+carry;
			else
				temp.data=temp.data+carry;
			carry =temp.data/10;
			temp.data%=10;
			if(carry==0)
				break;
			temp=temp.next;
		} 
		sl.head=reverse(sl.head);
		sl.display();
	}

	private static Node1 reverse(Node1 head) {
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

}
