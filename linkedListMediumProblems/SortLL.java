package linkedListMediumProblems;


public class SortLL {
	public static Node1 sort(Node1 head)
	{
		return mergesort(head);
	}
	public static Node1 getMiddle(Node1 head)
    {
        Node1 fast=head,slow=head,midprev=null;
        while(fast!=null && fast.next!=null)
        {
        	midprev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        midprev.next=null;
        return slow;
    }
	private static Node1 mergesort(Node1 head) {
		if(head==null || head.next==null)
			return head;
		Node1 mid = getMiddle(head);
		Node1 left=mergesort(head);
		Node1 right=mergesort(mid);
		return merge(left,right);
		
	}
	private static Node1 merge(Node1 head, Node1 mid) {
		Node1 temp=new Node1(-1);
		Node1 tail=temp;
		while(head!=null && mid!=null)
		{
			if(head.data>mid.data)
			{
				tail.next=mid;
				tail=tail.next;
				mid=mid.next;
			}
			else
			{
				tail.next=head;
				tail=tail.next;
				head=head.next;
			}
		}
//		while(head!=null)
//		{
//			tail.next=head;
//			tail=tail.next;
//			head=head.next;
//		}
//		while(mid!=null)
//		{
//			tail.next=mid;
//			tail=tail.next;
//			mid=mid.next;
//		}
		tail.next = head==null ? mid: head; 
		return temp.next;
	}
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		sl.head=sort(sl.head);
		sl.display();
	}

}
