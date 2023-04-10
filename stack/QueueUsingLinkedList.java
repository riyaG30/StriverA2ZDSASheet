package stack;

public class QueueUsingLinkedList<T> {
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
	Node<T> head,tail;
	int size;
	QueueUsingLinkedList()
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
	public void offer(T data)
	{
		Node<T> n=new Node<T>(data);
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
	public T poll()
	{
		if(size==0)
			return null;
		T data=head.data;
		head=head.next;
		size--;
		return data;
	}
	public static void main(String[] args) {
		QueueUsingLinkedList<Integer> st=new QueueUsingLinkedList<>();
		st.offer(1);
		st.offer(2);
		st.offer(3);
		st.offer(4);
		st.offer(5);
		st.offer(6);
		while(!st.isEmpty())
		{
			System.out.println(st.poll());
		}
	}

}
