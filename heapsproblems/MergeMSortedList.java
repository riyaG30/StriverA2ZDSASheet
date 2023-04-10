package heapsproblems;

import java.util.PriorityQueue;

class Node
{
	int data;
	Node next;
	public Node(int key)
	{
		data=key;
		next=null;
	}
}
public class MergeMSortedList {
	Node mergeKList(Node[]arr,int K)
    {
        Node head=null,tail=null;
        PriorityQueue<Node> pq=new PriorityQueue<>((x,y)->x.data-y.data);
        for(int i=0;i<K;i++)
        {
            if(arr[i]!=null)
            {
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty())
        {
            Node temp=pq.poll();
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                tail.next=temp;
                tail=tail.next;
            }
            if(temp.next!=null)
                pq.add(temp.next);
        }
        return head;
    }
}
