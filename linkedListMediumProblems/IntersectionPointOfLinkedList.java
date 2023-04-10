package linkedListMediumProblems;

public class IntersectionPointOfLinkedList {
	public static Node1 getIntersectionNode(Node1 head1, Node1 head2) {
		Node1 a=head1;
		Node1 b=head2;
        while(a!=b)
        {
            a = a==null ? head2 : a.next;
            b = b==null ? head1 : b.next;
        }
        return a;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		System.out.println(getIntersectionNode(sl.head,sl.head));

	}

}
