package binarysearchhard;

import java.util.Scanner;

public class KokoEatingBananas {
	public static int eatingBananas( int[] piles, int H) {
        int start=1;
        int end=(int)1e9;
        if(piles.length==1)
            return piles[0]/H;
        while(start<end)
        {
            int mid=start + (end-start)/2;
            int total=0;
            for(int i:piles)
            {
                total+=(i+mid-1)/mid;
            }
            if(total>H)
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int ans=eatingBananas(arr,m);
		System.out.println(ans);
		sc.close();
	}

}
