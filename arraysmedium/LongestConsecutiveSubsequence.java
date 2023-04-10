package arraysmedium;

import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int i:arr)
		{
			map.put(i, true);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]-1))
				map.put(arr[i], false);
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i])==false)
				continue;
			int current=1;
			while(map.containsKey(arr[i]+current))
			{
				current+=1;
			}
			max=Math.max(max, current);
		}
		System.out.println(max);
		sc.close();
	}

}
