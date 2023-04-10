package heapsproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianInAStream {
	static PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    public static void insertHeap(int x)
    {
       if(maxHeap.size()==0 || x<=maxHeap.peek())
            maxHeap.add(x);
        else
            minHeap.add(x);
        balanceHeaps();
    }
    public static void balanceHeaps()
    {
       if(maxHeap.size()>1 + minHeap.size())
            minHeap.add(maxHeap.poll());
        else if(maxHeap.size()<minHeap.size())
            maxHeap.add(minHeap.poll());
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        if(maxHeap.size()==minHeap.size())
            return (maxHeap.peek() + minHeap.peek())/2.0;
        return maxHeap.peek();
    }
}
