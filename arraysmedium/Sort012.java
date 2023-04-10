package arraysmedium;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void sort(int[] arr) {
		int low=0,mid=0,end=arr.length-1;
		while(mid<=end)
		{
			switch(arr[mid])
			{
			case 0:
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
//				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp=arr[mid];
				arr[mid]=arr[end];
				arr[end]=temp;
				end--;
			}
		}
		
	}

}
