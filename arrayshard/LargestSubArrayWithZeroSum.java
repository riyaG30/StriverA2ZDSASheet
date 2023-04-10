package arrayshard;

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArrayWithZeroSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0, -1);
		int sum=0,maxlen=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(map.containsKey(sum))
			{
				maxlen=Math.max(maxlen, i-map.get(sum));
			}
			else
			{
				map.put(sum, i);
			}
		}
		System.out.println(maxlen);
		sc.close();
	}
}
