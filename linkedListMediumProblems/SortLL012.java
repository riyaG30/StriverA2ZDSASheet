package linkedListMediumProblems;


public class SortLL012 {
	static Node1 segregate(Node1 head)
    {
		Node1 temp=head;
        int count0=0,count1=0,count2=0;
        while(temp!=null)
        {
            if(temp.data==0)
                count0++;
            else if(temp.data==1)
                count1++;
            else
                count2++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<count0;i++)
        {
            temp.data=0;
            temp=temp.next;
        }
        for(int i=count0;i<count0+count1;i++)
        {
            temp.data=1;
            temp=temp.next;
        }
        for(int i=count0+count1;i<count1+count0+count2;i++)
        {
            temp.data=2;
            temp=temp.next;
        }
        return head;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(0);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(0,2);
		sl.display();
		sl.head=segregate(sl.head);
		sl.display();
	}

}
