package stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingOneQueue {
	Queue<Integer> q1;
	int size;
	public ImplementStackUsingOneQueue()
	{
		q1=new LinkedList<>();
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
		int size=q1.size();
		q1.add(data);
		while(size>0)
		{
			q1.add(q1.remove());
			size--;
		}
	}
	public int pop()
	{
		if(!q1.isEmpty())
			return q1.poll();
		return -1;
	}
	public static void main(String[] args) {
		ImplementStackUsingOneQueue st=new ImplementStackUsingOneQueue();
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
