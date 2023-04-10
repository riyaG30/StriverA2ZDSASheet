package stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingTwoQueues{
	Queue<Integer> q1;
	Queue<Integer> q2;
	int size;
	public ImplementStackUsingTwoQueues()
	{
		q1=new LinkedList<>();
		q2=new LinkedList<>();
		this.size=0;
	}
	public int size()
	{
		return q1.size();
	}
	public boolean isEmpty()
	{
		return q1.isEmpty();
	}
	public void push(int data)
	{
		q2.add(data);
		while(!q1.isEmpty())
		{
			q2.add(q1.remove());
		}
		while(!q2.isEmpty())
		{
			q1.add(q2.remove());
		}
	}
	public int pop()
	{
		if(!q1.isEmpty())
			return q1.poll();
		return -1;
	}
	public static void main(String[] args) {
		ImplementStackUsingTwoQueues st=new ImplementStackUsingTwoQueues();
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
