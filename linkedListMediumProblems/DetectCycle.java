package linkedListMediumProblems;

public class DetectCycle {
	public static Node1 detectCycle(Node1 head) {
		Node1 fast=head;
		Node1 slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
            	Node1 temp=head;
               while(slow!=temp)
               {
                   slow=slow.next;
                   temp=temp.next;
               }
               return slow;
            }

        }
        return null;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		System.out.println(detectCycle(sl.head).data);

	}

}
