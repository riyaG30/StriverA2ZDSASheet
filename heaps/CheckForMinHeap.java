package heaps;

import java.util.Scanner;

public class CheckForMinHeap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(checkForMinHeap(arr));
		sc.close();
	}

	private static boolean checkForMinHeap(int[] arr) {
		int n=arr.length;
		for(int i=0;i<=(n/2)-1;i++)
        {
            int parent=i;
            int left = 2 * i + 1;
            int right = 2* i + 2;
            if(left < n)
            {
                if(arr[left]<arr[parent])
                    return false;
            }
            if(right < n)
            {
                if(arr[right]<arr[parent])
                    return false;
            }
        }
        return true;
	}

}
