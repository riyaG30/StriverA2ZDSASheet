package binarysearch;
 
import java.util.Scanner;

public class KthElementOfTwoSortedArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int kthelement=findK(arr,arr2,5);
		System.out.println(kthelement);
		sc.close();
	}

	private static int findK(int[] arr, int[] arr2,int k) {
		if(arr.length>arr2.length)
			return findK(arr2,arr,k);
		//as we want to apply binary search on small array
		int low=Math.max(0, k-arr2.length),high=Math.min(k,arr.length);
		//If we have an empty array then it is impossible for us to select anything from that array
		//will result in arr.length=5 suppose low=max(0,4-5) and high=min(4,0);
		while(low<=high)
		{
			int cut1=(low+high)/2;
			int cut2=k-cut1;
			
			int left1=cut1==0 ?Integer.MIN_VALUE : arr[cut1-1];
			int left2=cut2==0 ? Integer.MIN_VALUE : arr2[cut2-1];
			
			int right1= cut1==arr.length ? Integer.MAX_VALUE:arr[cut1];
			int right2= cut2==arr2.length ? Integer.MAX_VALUE:arr2[cut2];
			
			if(left1<=right2 && left2<=right1)
			{
				return Math.max(left1, left2);
			}
			else if(left1>right2)
			{
				high=cut1-1;
			}
			else
				low=cut1+1;
		}
		return -1;
	}

}
