package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberOfPlatforms {
	static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0,count=0,max=0;
        while(i<arr.length && j<dep.length)
        {
            if(arr[i]<=dep[j])
            {
                count++;
                max=Math.max(count,max);
                i++;
            }
            else if(arr[i]>dep[j])
            {
                count--;
                j++;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] dep=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			dep[i]=sc.nextInt();
		}
		System.out.println(findPlatform(arr,dep,n));
		sc.close();
	}

}
