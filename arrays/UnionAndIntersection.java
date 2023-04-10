package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UnionAndIntersection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr2=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> ans=union(arr,arr2);
		System.out.println(ans);
		sc.close();
	}

	private static ArrayList<Integer> union(int[] arr, int[] arr2) {
		HashSet<Integer> hs=new HashSet<>();
		int i=0,j=0;
		while(i<arr.length && j<arr2.length)
		{
			if(arr[i]>arr2[j])
			{
				hs.add(arr[j++]);
			}
			else
				hs.add(arr2[i++]);
		}
		while(i<arr.length)
		{
			hs.add(arr[i++]);
		}
		while(j<arr2.length)
		{
			hs.add(arr2[j++]);
		}
		return new ArrayList<>(hs);
	}
}
