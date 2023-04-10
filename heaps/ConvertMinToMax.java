package heaps;

public class ConvertMinToMax {
	private static void downheapify(int[] arr, int start, int end) {
		int parent=start;
		int left= 2 * parent + 1;
		int right= 2 * parent + 2;
		while(left < end)
		{
			int minindex=parent;
			if(arr[left]>arr[minindex])
			{
				minindex=left;
			}
			if(right < end && arr[right]>arr[minindex])
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
    static void convertMinToMaxHeap(int N, int arr[]) {
        for(int i=(arr.length/2)-1;i>=0;i--)
			downheapify(arr,i,arr.length);
    }
}
