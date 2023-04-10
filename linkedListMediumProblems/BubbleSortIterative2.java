package linkedListMediumProblems;

public class BubbleSortIterative2 {
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(1);
		sl.insertFirst(9);
		sl.insertFirst(2);
		sl.insertLast(8);
		sl.insertFirst(3);
		sl.insertFirst(7);
		sl.display();
		sl.head=sort(sl.head,sl.size);
		sl.display();

	}

	private static Node1 sort(Node1 head,int size) {
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size;j++)
			{
				Node1 first=get(j,head);
				Node1 second=get(j+1,head);
				if(first.data>second.data)
				{
					if(first==head)
					{
						first.next=second.next;
						second.next=first;
						head=second;
					}
					else 
					{
						Node1 temp=get(j-1,head);
						temp.next=first.next;
						first.next=second.next;
						second.next=first;
					}
				}
			}
		}
		return head;
	}

	private static Node1 get(int j,Node1 head) {
		Node1 temp=head;
		for(int i=1;temp!=null && i<j;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
}
