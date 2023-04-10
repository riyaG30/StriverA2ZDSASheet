package binarysearchhard;

import java.util.Scanner;
  
public class MakingMBouquets {
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
		int ans=minDays(arr,m,k);
		System.out.println(ans);
		sc.close();
	}
	//This question is based on finding the minimum value
	public static int minDays(int[] bloomDay, int M, int K) {
        if((long) M * K > (long)bloomDay.length)
            return -1;
       int start=1;
       int end=(int)1e9;
       while(start<end)
       {
           int subarray=1;
           int total=0;
           int mid=start+(end-start)/2;
           for(int i=0;i<bloomDay.length;i++)
           {
               if(bloomDay[i]>mid)
               {
                    total=0;
               }
               else
               {
                   total++;
                   if(total==K)
                   {
                        subarray++;
                    total=0;
                    }
               }
           }
           if(subarray<=M)
                start=mid+1;
            else
                end=mid;
       }
       return start;
	}
}
