package arrayshard;

import java.util.List;
import java.util.*;

public class FourSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		List<List<Integer>> ans=fourSum(arr,target);
		System.out.println(ans);
		sc.close();

	}

	private static List<List<Integer>> fourSum(int[] arr, int target) {
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<arr.length-3;i++)
		{
			if(i==0 || arr[i]!=arr[i-1])
			{
				for(int j=i+1;j<arr.length-2;j++)
				{
					if(j==i+1 || arr[j]!=arr[j-1])
					{
						int k=j+1;
						int l=arr.length-1;
						int sum=target-arr[i]-arr[j];
						while(k<l)
						{
							if(sum==arr[k]+arr[l])
							{
								ans.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
								while(k<l && arr[k]==arr[k+1])
									k++;
								while(k<l && arr[l]==arr[l-1])
									l--;
								k++;
								l--;
							}
							else if(sum<arr[k]+arr[l])
								l--;
							else
								k++;
						}
					}
				}
			}
		}
		return ans;
	}

}
