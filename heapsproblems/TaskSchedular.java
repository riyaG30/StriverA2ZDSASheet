package heapsproblems;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSchedular {
	static int leastInterval(int N, int K, char tasks[]) {
        int[] count=new int[26];
        for(int i=0;i<tasks.length;i++)
        {
            count[tasks[i]-'A']++;
        }
        Arrays.sort(count);
        int chunks=count[25]-1;
        int idle=chunks * K;
        //We have taken care of the maximum element now 
        //we will iterate over the array from second last element and find the number of idle;
        //If idle is negative then return the task length else task + idle
        for(int i=24;i>=0;i--)
        {
            //Remember to take the min of the chunks and count[i]
            idle-=Math.min(count[i],chunks);
        }
        //If i turns to be negative then return task.length
        return idle<0 ? tasks.length : tasks.length + idle;
    }
	// A A A B B B 
	//The last B doesnt matter
	//Hence we take the minimum of chunks and count[i]
	// A _B _-> A B_ ->_ A B 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] arr=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		int k=sc.nextInt();
		System.out.println(leastInterval(n,k,arr));
		sc.close();

	}

}
