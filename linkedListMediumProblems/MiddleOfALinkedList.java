package linkedListMediumProblems;


public class MiddleOfALinkedList {
	public static  int getMiddle(Node1 head)
    {
        Node1 fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		System.out.println(getMiddle(sl.head));

	}

}
