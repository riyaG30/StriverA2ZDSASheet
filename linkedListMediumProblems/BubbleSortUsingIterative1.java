package linkedListMediumProblems;



public class BubbleSortUsingIterative1 {

	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		sort(sl.head,sl.size);
		sl.display();

	}

	private static void sort(Node1 head,int size) {
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size;j++)
			{
				Node1 first=get(j,head);
				Node1 second=get(j+1,head);
				if(first.data>second.data)
				{
					int temp=first.data;
					first.data=second.data;
					second.data=temp;
				}
			}
		}
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
