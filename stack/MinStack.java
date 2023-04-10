package stack;

import java.util.Stack;

public class MinStack {
	public int size;
	public int min;
	Stack<Integer> s;
	public MinStack()
	{
		size=0;
		s=new Stack<>();
	}
	public int size()
	{
		return s.size();
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	public void push(int data)
	{
		if(isEmpty())
		{
			min=data;
			s.push(data);
		}
		else if(data>=min)
		{
			s.push(data);
		}
		else
		{
			s.push(data+data-min);
			min=data;
		}
	}
	public int min()
	{
		if(isEmpty())
			return -1;
		return min;
	}
	public int peek()
	{
		if(isEmpty())
			return -1;
		if(s.peek()>min)
			return s.peek();
		return 2*min-s.peek();
	}
	public int pop()
	{
		if(isEmpty())
			return -1;
		if(s.peek()>min)
			return s.pop();
		//the fake value is pushed and minimum contains the true value
		//Change the minimum as well
		int value=min;
		min = 2 * min - s.pop();
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
