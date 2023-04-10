package stack;

public class StackUsingLinkedList<T> {
	@SuppressWarnings("hiding")
	class Node<T>
	{
		T data;
		Node<T> next;
		public Node(T d)
		{
			data=d;
		}
	}
	Node<T> head;
	int size;
	StackUsingLinkedList()
	{
		this.size=0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	public void push(T data)
	{
		Node<T> n=new Node<T>(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
		size++;
	}
	public T pop()
	{
		if(size==0)
			return null;
		T data=head.data;
		head=head.next;
		size--;
		return data;
	}
	public static void main(String[] args) {
		StackUsingLinkedList<Integer> st=new StackUsingLinkedList<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}
	}

}
