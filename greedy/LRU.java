package greedy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LRU {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(lru(arr,sc.nextInt()));
		sc.close();
	}

	private static int lru(int[] arr, int window) {
		Queue<Integer> q=new LinkedList<>();
		int pagefault=0;
		for(int i=0;i<arr.length;i++)
		{
			if(q.contains(arr[i]))
			{
				q.remove(arr[i]);
				q.add(arr[i]);
			}
			else if(q.size()<window)
			{
				q.add(arr[i]);
				pagefault++;
			}
			else
			{
				q.poll();
				q.add(arr[i]);
				pagefault++;
			}
		}
		return pagefault;
	}

}
