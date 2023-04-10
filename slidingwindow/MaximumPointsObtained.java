package slidingwindow;

import java.util.Scanner;

public class MaximumPointsObtained {
	static long maxScore(int arr[], int n, int k) {
	       long sum=0;
	       long max=0;
	       //check from starting
	       //Store the max sum in a variable
	       for(int i=0;i<k;i++)
	       {
	           sum+=arr[i];
	       }
	       //Now remove one element from sum and add element from the right 
	       //max would contain only the maximum until the end point
	       max=Math.max(sum,max);
	       int suml=0;
	       for(int i=0;i<k;i++)
	       {
	           //for getting the last element 
	           suml=suml+arr[n-i-1];
	           //for removing the k-1 element from sum
	           sum-=arr[k-i-1];
	           
	           max=Math.max(sum+suml,max);
	       }
	       return max;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(maxScore(arr,n,sc.nextInt()));
		sc.close();
	}
}
