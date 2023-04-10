package heaps;

import java.util.Arrays;

public class HeapSortMax {
	public static void main(String[] args) {
		int[] arr= {7,6,5,4};
		heapsort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void heapsort(int[] arr) {
		//For minheap sort we will apply max heap logic 
		//We will only be checking the parents in this case
		//Make the array a min heap and then apply the logic of sorting
		//We will find the min element and push it to the end and then reduce the search space
		for(int i=(arr.length/2)-1;i>=0;i--)
			downheapify(arr,i,arr.length);
		for(int i=arr.length-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			downheapify(arr,0,i);
		}
		
	}

	private static void downheapify(int[] arr, int start, int end) {
		int parent=start;
		int left= 2 * parent + 1;
		int right= 2 * parent + 2;
		while(left < end)
		{
			int minindex=parent;
			if(arr[left]<arr[parent])
			{
				minindex=left;
			}
			if(right < end && arr[right]<arr[minindex])
				minindex=right;
			if(minindex==parent)
				return;
			int temp=arr[minindex];
			arr[minindex]=arr[parent];
			arr[parent]=temp;
			parent=minindex;
			left = 2 * parent +1;
			right=2* parent + 2;
		}
	}
}
