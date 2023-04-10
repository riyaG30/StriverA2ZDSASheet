package llhardproblems;

public class ReverseSomePartOfLL {
	public static Node1 reverse(Node1 head,int l,int r)
	{
		Node1 prev=null;
		Node1 current=head;
		for(int i=0;current!=null && i<l;i++)
		{
			prev=current;
			current=current.next;
		}
		Node1 start=prev;
		Node1 reverse_end=current;
		Node1 next=current.next;
		for(int i=0;i<r-l+1;i++)
		{
			current.next=prev;
			prev=current;
			current=next;
			if(next!=null)
				next=next.next;
		}
		if(start==null)
			head=prev;
		else
			start.next=prev;
		reverse_end.next=current;
		return head;
	}
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		sl.head=reverse(sl.head,1,3);
		sl.display();
		
	}

}
