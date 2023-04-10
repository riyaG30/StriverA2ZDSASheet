package linkedListMediumProblems;

class Node1
{
	int data;
	Node1 next;
	public Node1(int data)
	{
		this.data=data;
	}
}
public class SinglyLinkedList {
	//Making this class inside our class so that there is no problem using the same class int different classes
	Node1 head,tail;
	int size=0;
	public int size()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	public void insertFirst(int data)
	{
		Node1 n=new Node1(data);
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
		size++;
	}
	public void insertLast(int data)
	{
		Node1 n=new Node1(data);
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			tail.next=n;
			tail=n;
		}
		size++;
	}
	public void reverse(Node1 head)
	{
		if(head==tail)
		{
			this.head=head;
			return;
		}
		reverse(head.next);
		tail.next=head;
		tail=tail.next;
		tail.next=null;
	}
	public void insert(int data,int index)
	{
		if(index==0)
		{
			insertFirst(data);
			return;
		}
		if(index==size)
		{
			insertLast(data);
			return;
		}
		Node1 n=new Node1(data);
		Node1 temp=get(index-1);
		if(temp==null)
			return;
		n.next=temp.next;
		temp.next=n;
		size++;
	}
	private Node1 get(int index) {
		Node1 temp=head;
		for(int i=0;temp!=null && i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public void display()
	{
		Node1 temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public int deleteFirst()
	{
		if(head==null)
			return -1;
		int data=head.data;
		head=head.next;
		size--;
		return data;
	}
	public int deleteLast()
	{
		if(size==1)
		{
			return deleteFirst();
		}
		Node1 temp=get(size-2);
		temp.next=null;
		int data=tail.data;
		tail=temp;
		size--;
		return data;
	}
	public int delete(int index)
	{
		if(index==0)
		{
			return deleteFirst();
		}
		if(index==size-1)
		{
			return deleteLast();
		}
		Node1 temp=get(index-1);
		int data=temp.next.data;
		temp.next=temp.next.next;
		size--;
		return data;
	}
	public int getIndex(int data)
	{
		int count=0;
		Node1 temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
				return count;
			temp=temp.next;
			count++;
		}
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
//		sl.deleteFirst();
//		sl.display();
//		sl.deleteLast();
//		sl.display();
//		sl.delete(2);
//		sl.display();
		sl.reverse(sl.head);
		sl.display();
//		System.out.println(sl.getIndex(3));
	}
}
