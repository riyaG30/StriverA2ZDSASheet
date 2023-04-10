package slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctElementInEveryWindow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(distinctElement(arr,n,sc.nextInt())));
		sc.close();
	}

	private static int[] distinctElement(int[] arr, int n, int k) {
		int[] ans=new int[n-k+1];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int i=0;
		for(;i<n-k;i++)
		{
			ans[i]=map.keySet().size();
			int add = i+ k;
			if(map.get(arr[i])==1)
				map.remove(arr[i]);
			else
				map.put(arr[i], map.get(arr[i])-1);
			map.put(arr[add],map.getOrDefault(arr[add],0)+1);
		}
		ans[i]=map.keySet().size();
		return ans;
	}
	
}
