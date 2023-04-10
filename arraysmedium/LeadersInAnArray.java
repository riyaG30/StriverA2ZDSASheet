package arraysmedium;

import java.util.*;

public class LeadersInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> ans=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>=max)
			{
				ans.add(arr[i]);
				max=arr[i];
			}
		}
		Collections.reverse(ans);
		System.out.println(ans);
		sc.close();
	}
}
