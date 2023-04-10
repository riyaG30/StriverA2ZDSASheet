package arraysmedium;

import java.util.*;
import java.util.Scanner;
class Pair
{
	int first;
	int second;
	public Pair(int f,int s)
	{
		first=f;
		second=s;
	}
}
public class TwoSumUsingTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] arr1=new int[m];
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		Pair[] p=twoSum(arr,arr1,target);
		for(Pair q:p)
		{
			System.out.println(q.first+" "+q.second);
		}
		sc.close();
	}

	private static Pair[] twoSum(int[] arr, int[] arr1,int target) {
		HashMap<Integer,Integer> map=new HashMap<>();
		List<Pair> ls=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			map.put(arr1[i], i);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(target-arr[i]))
			{
				ls.add(new Pair(arr[i],target-arr[i]));
			}
		}
		Pair[] ans=new Pair[ls.size()];
		int k=0;
		for(Pair p:ls)
		{
			ans[k++]=new Pair(p.first,p.second);
		}
		Arrays.sort(ans,new Comparator<>(){
			public int compare(Pair x,Pair y)
			{
				if(x.first==y.first)
					return 0;
				else if(x.first>y.first)
					return 1;
				return -1;
			}

		});
		return ans;
	}

}
