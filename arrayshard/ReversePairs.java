package arrayshard;

import java.util.Scanner;

public class ReversePairs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=mergeSort(arr,0,arr.length);
		System.out.println(count);
		sc.close();
	}

	private static int mergeSort(int[] arr, int start, int end) {
		int count=0;
		if(end-start==1)
			return count;
		int mid=start + (end-start)/2;
		count+=mergeSort(arr,start,mid);
		count+=mergeSort(arr,mid,end);
		count+=merge(arr,start,mid,end);
		return count;
	}

	private static int merge(int[] arr, int start, int mid, int end) {
		int count=0;
		int j=mid;
		for(int i=start;i<mid;i++)
		{
			while(j<end && arr[i]> 2 * arr[j])
			{
				j++;
			}
			count+=(j-mid);
		}
		int i=start,k=0;
		j=mid;
		int[] arr1=new int[end-start];
		while(i<mid && j<end)
		{
			if(arr[i]>arr[j])
			{
				arr1[k++]=arr[j++];
			}
			else
				arr1[k++]=arr[i++];
		}
		while(i<mid)
		{
			arr1[k++]=arr[i++];
		}
		while(j<end)
		{
			arr1[k++]=arr[j++];
		}
		for(int u=0;u<arr1.length;u++)
		{
			arr[u+start]=arr1[u];
		}
		return count;
	}
}
