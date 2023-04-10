package slidingwindow;

import java.util.Scanner;

public class CountSubArraysWithKodds {
	public static int count(int n, int[] arr, int k)
    {
        int j=0;
        int count=0;
        int countOfSubarrays=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
                count++;
            while(count>k)
                {
                    if(arr[j]%2!=0)
                        count--;
                    j++;
                }
            countOfSubarrays+=i-j+1;
        }
        return countOfSubarrays;
    }
    public static int countSubarray( int[] arr,int n, int k) {
        return count(n,arr,k)-count(n,arr,k-1);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(countSubarray(arr,n,sc.nextInt()));
		sc.close();
	}

}
