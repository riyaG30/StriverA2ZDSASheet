package linkedListMediumProblems;

public class LengthOfCycle {
	static int countNodesinLoop(Node1 head)
    {
		Node1 slow=head;
		Node1 fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                int length=0;
                Node1 temp=slow;
                do
                {
                    length++;
                    temp=temp.next;
                }while(slow!=temp);
                return length;
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		System.out.println(countNodesinLoop(sl.head));
	}

}
