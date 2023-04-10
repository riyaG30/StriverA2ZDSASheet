package greedy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Meeting
{
    int start;
    int end;
    public Meeting(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
}
public class NMeetingsInOneRoom {
	 public static int maxMeetings(int start[], int end[], int n)
	    {
	        if(start.length==0 || end.length==0)
	            return -1;
	        PriorityQueue<Meeting> pq=new PriorityQueue<>(new Comparator<>()
	        {
	            public int compare(Meeting x,Meeting y)
	            {
	                return x.end-y.end;
	            }
	        });
	        for(int i=0;i<n;i++)
	        {
	            pq.add(new Meeting(start[i],end[i]));
	        }
	        int count=1;
	        int max=1;
//	        int start1=pq.peek().start;
	        int end1=pq.peek().end;
	        pq.poll();
	        while(!pq.isEmpty())
	        {
	            int start2=pq.peek().start;
	            int end2=pq.peek().end;
	            if(start2>end1)
	            {
	                count++;
	                end1=end2;
	            }
	            max=Math.max(count,max);
	            pq.poll();
	        }
	        return max;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] start=new int[n];
		int[] end=new int[n];
		for(int i=0;i<n;i++)
		{
			start[i]=sc.nextInt();
			end[i]=sc.nextInt();
		}
		maxMeetings(start,end,n);
		sc.close();
	}

}
