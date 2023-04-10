package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithGivenSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int subarray=targetSum(arr,target);
		System.out.println(subarray);
		sc.close();
	}

	private static int targetSum(int[] arr, int target) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int maxlen=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum==target)
				maxlen=i+1;
			if(map.containsKey(sum)==false)
				map.put(sum,i);
			if(map.containsKey(sum-target))
			{
				maxlen=Math.max(maxlen, i-map.get(sum-target));
			}
		}
		return maxlen;
	}
}
