package linkedListMediumProblems;


public class NthNodeFromBack {
	public static int size(Node1 head)
    {
        int size=0;
        Node1 temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }
    static int getNthFromLast(Node1 head, int n)
    {
    		int size=size(head);
    		if(n>size)
    		    return -1;
    		Node1 temp=head;
    		for(int i=0;temp!=null && i<size-n;i++)
    		{
    		    temp=temp.next;
    		}
    		if(temp!=null)
    		    return temp.data;
    		 return -1;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		System.out.println(getNthFromLast(sl.head,2));

	}

}
