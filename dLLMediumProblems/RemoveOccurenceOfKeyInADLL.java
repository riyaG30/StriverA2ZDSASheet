package dLLMediumProblems;

public class RemoveOccurenceOfKeyInADLL {
	static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head;
        while(temp!=null)
        {
            if(temp==head &&  temp.data==x)
                {
                    head=head.next;
                    temp=head;
                }
            else
            {
                if(temp.data==x)
                {
                    Node prev=temp.prev;
                    Node next=temp.next;
                    prev.next=next;
                    if(next!=null)
                        next.prev=prev;
                    temp=next;
                }
                else
                    temp=temp.next;
            }
        }
        return head;
    }
	public static void main(String[] args) {
		DoublyLinkedList sl=new DoublyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		sl.head=deleteAllOccurOfX(sl.head,2);
		sl.display();
	}
}
