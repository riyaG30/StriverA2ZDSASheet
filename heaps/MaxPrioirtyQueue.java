package heaps;

import java.util.ArrayList;

public class MaxPrioirtyQueue {
	public ArrayList<Integer> arr;
	public MaxPrioirtyQueue()
	{
		arr=new ArrayList<>();
	}
	public int size()
	{
		return arr.size();
	}
	public boolean isEmpty()
	{
		return arr.size()==0;
	}
	public void add(int data)
	{
		arr.add(data);
		int child=arr.size()-1;
		int parent=(child-1)/2;
		while(child>0)
		{
			if(arr.get(child)>arr.get(parent))
			{
				int temp=arr.get(child);
				arr.set(child, arr.get(parent));
				arr.set(parent, temp);
				child = parent;
				parent = (child-1)/2;
			}
			else 
				return;
		}
	}
	public int removeMax()
	{
		int value=arr.get(0);
		arr.set(0, arr.get(arr.size()-1));
		arr.remove(arr.size()-1);
		int parent=0;
		int left= 2 * parent + 1;
		int right = 2 * parent + 2;
		while(left < arr.size())
		{
			int minindex=parent;
			if(arr.get(left)>arr.get(minindex))
			{
				minindex=left;
			}
			if(right < arr.size() && arr.get(right)>arr.get(minindex))
				minindex=right;
			if(minindex==parent)
				break;
			int temp=arr.get(parent);
			arr.set(parent, arr.get(minindex));
			arr.set(minindex, temp);
			parent=minindex;
			left= 2 * parent +1 ;
			right = 2 * parent + 2;
		}
		return value;
	}
	public static void main(String[] args) {
		MaxPrioirtyQueue mq=new MaxPrioirtyQueue();
		mq.add(1);
		mq.add(4);
		mq.add(9);
		mq.add(7);
		mq.add(6);
		while(!mq.isEmpty())
		{
			System.out.println(mq.removeMax());
		}
	}
}
