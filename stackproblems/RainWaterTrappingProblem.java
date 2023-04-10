package stackproblems;

import java.util.Scanner;

public class RainWaterTrappingProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(trapping(arr,n));
		sc.close();
	}

	private static int trapping(int[] arr, int n) {
		int ans=0;
		int right=n-1,left=0;
		int rightmax=0,leftmax=0;
		//Now we will start from 0 and try to find the maximum entry from start and end subtract the arr[i] from minimum from trapping water
		while(left<right)
		{
			if(arr[left]<=arr[right])
			{
				if(leftmax<=arr[left])
					leftmax=arr[left];
				else
					ans+=leftmax-arr[left];
				left++;
			}
			else
			{
				if(rightmax<=arr[right])
				{
					rightmax=arr[right];
				}
				else
					ans+=rightmax-arr[right];
				right--;
			}
		}
		return ans;
	}

}
