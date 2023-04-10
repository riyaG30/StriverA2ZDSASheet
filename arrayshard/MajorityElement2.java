package arrayshard;

import java.util.ArrayList;
import java.util.Scanner;

public class MajorityElement2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> ans=majority(arr);
		System.out.println(ans);
		sc.close();
	}

	private static ArrayList<Integer> majority(int[] arr) {
		int count1=0,count2=0,element1=0,element2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(count1==0)
			{
				element1=arr[i];
				count1=1;
			}
			else if(count2==0)
			{
				element2=arr[i];
				count2=1;
			}
			else if(element1==arr[i])
			{
				count1++;
			}
			else if(element2==arr[i])
				count2++;
			else
			{
				count1--;
				count2--;
			}
		}
		count1=0;
		count2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(element1==arr[i])
				count1++;
			else if(element2==arr[i])
				count2++;
		}
		ArrayList<Integer> ans=new ArrayList<>();
		if(count1>arr.length/3)
			ans.add(element1);
		if(count2>arr.length/3)
			ans.add(element2);
		if(ans.size()==0)
			ans.add(-1);
		return ans;
	}

}
