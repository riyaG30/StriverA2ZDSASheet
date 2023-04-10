package arraysmedium;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int majority=maxAppearance(arr);
		System.out.println(majority);
		sc.close();
	}

	private static int maxAppearance(int[] arr) {
		int count=0,element=0;
		for(int i=0;i<arr.length;i++)
		{
			if(count==0)
				element=arr[i];
			if(arr[i]==element)
				count++;
			else
				count--;
		}
		count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(element==arr[i])
				count++;
		}
		if(count>arr.length/2)
			return element;
		return -1;
	}

}
