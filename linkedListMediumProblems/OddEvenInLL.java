package linkedListMediumProblems;


public class OddEvenInLL {
	static Node1 divide( Node1 head){
		Node1 EvenHead=new Node1(-1);
		Node1 OddHead =new Node1(-1);
		Node1 EvenTail=EvenHead,OddTail=OddHead;
        while(head!=null)
        {
            if(head.data%2==0)
            {
            	Node1 n=new Node1(head.data);
                EvenTail.next=n;
                EvenTail=EvenTail.next;
            }
            else
            {
            	Node1 n=new Node1(head.data);
                OddTail.next=n;
                OddTail=OddTail.next;
            }
            head=head.next;
        }
        EvenHead=EvenHead.next;
        OddHead=OddHead.next;
        if(EvenHead==null)
            return OddHead;
        if(OddHead==null)
            return EvenHead;
        EvenTail.next=OddHead;
        OddTail.next=null;
        return EvenHead;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		sl.head=divide(sl.head);
		sl.display();
	}
}
