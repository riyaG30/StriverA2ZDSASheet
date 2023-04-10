package arrayshard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		List<List<Integer>> ans=threeSum(arr);
		System.out.println(ans);
		sc.close();
	}

	private static List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> ans=new ArrayList<>();
		Arrays.sort(arr);
		//for target zero
		for(int i=0;i<arr.length-2;i++)
		{
			if(i==0 || arr[i]!=arr[i-1])
			{
				int j=i+1;
				int k=arr.length-1;
				int sum=-arr[i];
				while(j<k)
				{
					if(sum==arr[j]+arr[k])
					{
						ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
						while(j<k && arr[j]==arr[j+1])
							j++;
						while(j<k && arr[k]==arr[k-1])
							k--;
						j++;
						k--;
					}
					else if(sum<arr[j]+arr[k])
						k--;
					else
						j++;
				}
			}
		}
		return ans;
	}

}
