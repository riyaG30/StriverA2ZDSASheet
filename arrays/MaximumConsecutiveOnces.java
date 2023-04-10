package arrays;

import java.util.Scanner;

public class MaximumConsecutiveOnces {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int max=maximumConsecutiveOnes(arr,m);
		System.out.println(max);
		sc.close();
	}

	private static int maximumConsecutiveOnes(int[] arr,int m) {
		int j=-1,count=0;
		int maxlen=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
			while(count>m)
			{
				j++;
				if(arr[j]==0)
				{
					count--;
				}
			}
			maxlen=Math.max(maxlen, i-j);
		}
		return maxlen;
	}
}
