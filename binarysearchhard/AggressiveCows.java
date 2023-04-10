package binarysearchhard;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int k=sc.nextInt();
		int ans=solve(m,k,arr);
		System.out.println(ans);
		sc.close();
	}
	public static int solve(int n, int k, int[] nums) {
        Arrays.sort(nums);
        int start=1;
        int end=nums[n-1]-nums[0];
        while(start<end)
        {
            int mid = start + (end-start)/2;
            int total=1;
            int coordinate=nums[0];
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]-coordinate>mid)
                {
                    total++;
                    coordinate=nums[i];
                }
            }
            if(total>=k)
            {
                start=mid+1;
            }
            else
                end=mid;
        }
        return start;
    }
}
