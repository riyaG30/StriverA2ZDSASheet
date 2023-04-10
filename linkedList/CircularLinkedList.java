package linkedList;


public class CircularLinkedList {
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
	Node head,tail;
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
		Node n=new Node(data);
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
		tail.next=head;
		size++;
	}
	public void insertLast(int data)
	{
		Node n=new Node(data);
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
		tail.next=head;
		size++;
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
		Node n=new Node(data);
		Node temp=get(index-1);
		if(temp==null)
			return;
		n.next=temp.next;
		temp.next=n;
		size++;
	}
	private Node get(int index) {
		Node temp=head;
		for(int i=0;temp.next!=head && i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public void display()
	{
		Node temp=head;
		while(temp.next!=head)
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
		if(head!=null)
			tail.next=head;
		size--;
		return data;
	}
	public int deleteLast()
	{
		if(size==1)
		{
			return deleteFirst();
		}
		Node temp=get(size-2);
		temp.next=null;
		int data=tail.data;
		tail=temp;
		tail.next=head;
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
		Node temp=get(index-1);
		int data=temp.next.data;
		temp.next=temp.next.next;
		size--;
		return data;
	}
	public int getIndex(int data)
	{
		int count=0;
		Node temp=head;
		while(temp.next!=head)
		{
			if(temp.data==data)
				return count;
			temp=temp.next;
			count++;
		}
		return -1;
	}
	public static void main(String[] args) {
		CircularLinkedList sl=new CircularLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		sl.deleteFirst();
		sl.display();
		sl.deleteLast();
		sl.display();
		sl.delete(2);
		sl.display();
		System.out.println(sl.getIndex(3));
	}
}
