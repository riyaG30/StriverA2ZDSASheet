package stack;

import java.util.Stack;

public class QueueUsingTwoStacks {

	Stack<Integer> s1;
	Stack<Integer> s2;
	int size;
	public QueueUsingTwoStacks()
	{
		s1=new Stack<>();
		s2=new Stack<>();
		this.size=0;
	}
	public int size()
	{
		return s1.size();
	}
	public boolean isEmpty()
	{
		return s1.isEmpty();
	}
	public void offer(int data)
	{
		while(!s1.isEmpty())
		{
			s2.add(s1.pop());
		}
		s1.add(data);
		while(!s2.isEmpty())
		{
			s1.add(s2.pop());
		}
	}
	public int poll()
	{
		if(!s1.isEmpty())
			return s1.pop();
		return -1;
	}
	public static void main(String[] args) {
		QueueUsingTwoStacks st=new QueueUsingTwoStacks();
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
