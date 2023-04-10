package arrayshard;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOfSubArrayXoR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int ans1=subsetXOR1(arr,arr.length,k);
		int ans2=subsetXOR2(arr,arr.length,k);
		System.out.println(ans1+" "+ans2);
		sc.close();

	}
	//Some cases not covered
	private static int subsetXOR2(int[] arr,int n,int k) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int ans=0,count=0;
		for(int i=0;i<n;i++)
		{
			ans^=arr[i];
			if(ans==k)
				count++;
			if(map.get(ans^k)!=null)
				count+=map.get(ans^k);
			map.put(ans, map.getOrDefault(ans,0)+1);
		}
		return count;
	}
	//Covers all cases
	private static int subsetXOR1(int[] arr,int n,int k) {
		if(n==0)
		{
			if(k==0)
				return 1;
			else
				return 0;
		}
		int taken=subsetXOR1(arr,n-1,arr[n-1]^k);
		int notTaken=subsetXOR1(arr,n-1,k);
		return taken + notTaken;
	}

}
