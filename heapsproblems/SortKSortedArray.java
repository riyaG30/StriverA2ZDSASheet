package heapsproblems;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair
{
    int data;
    int row;
    int col;
    public Pair(int d,int r,int c)
    {
        data=d;
        row=r;
        col=c;
    }
}
public class SortKSortedArray {
	 public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
	    {
	        ArrayList<Integer> ans=new ArrayList<>();
	        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->x.data-y.data);
	        for(int i=0;i<K;i++)
	        {
	            pq.add(new Pair(arr[i][0],i,0));
	        }
	        while(!pq.isEmpty())
	        {
	            int data=pq.peek().data;
	            int row=pq.peek().row;
	            int col=pq.peek().col;
	            pq.poll();
	            ans.add(data);
	            col++;
	            if(col<arr.length)
	            {
	                //to take the next element in the particular row
	                pq.add(new Pair(arr[row][col],row,col));
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(mergeKArrays(arr,sc.nextInt()));
		sc.close();
	}

}
