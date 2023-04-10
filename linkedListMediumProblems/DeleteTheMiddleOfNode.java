package linkedListMediumProblems;

public class DeleteTheMiddleOfNode {
	static void deleteMid(Node1 head) {
		Node1 fast=head,slow=head;
		Node1 midprev=null;
        while(fast!=null && fast.next!=null)
        {
            midprev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        midprev.next=slow.next;
//        return head;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		deleteMid(sl.head);
		sl.display();


	}

}
