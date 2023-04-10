package arrayshard;

import java.util.Scanner;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		//Extended version of kadane's algorithm
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int ans=1;
		for(int i=0;i<n;i++)
		{
			ans*=arr[i];
			max=Math.max(ans, max);
			if(ans==0)
				ans=1;
		}
		ans=0;
		for(int i=n-1;i>=0;i--)
		{
			ans*=arr[i];
			max=Math.max(ans, max);
			if(ans==0)
				ans=1;
		}
		System.out.println(max);
		sc.close();
	}

}
