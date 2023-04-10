package llhardproblems;

public class RotateALL {
	public static Node1 rotate(Node1 head, int k) {
		Node1 temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        temp=head;
        for(int i=0;i<k-1;i++)
        {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
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
		sl.head=rotate(sl.head,2);
		sl.display();
	}

}
