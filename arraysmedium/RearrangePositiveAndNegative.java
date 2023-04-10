package arraysmedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangePositiveAndNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		rearrange(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void rearrange(int[] arr) {
		ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>=0)
           {
               arr1.add(arr[i]);
           }
           else
               arr2.add(arr[i]);
       }
       int k=0;
       int i=0;
       int j=0;
       while(i<arr1.size() && j<arr2.size())
       {
           if(!arr1.isEmpty())
           {
           arr[k++]=arr1.get(i++);
           }
           if(!arr2.isEmpty())
           {
           arr[k++]=arr2.get(j++);
           }
       }
       while(i<arr1.size())
       {
           if(!arr1.isEmpty())
           {
           arr[k++]=arr1.get(i++);
           }
       }
        while(j<arr2.size())
       {
           if(!arr2.isEmpty())
           {
           arr[k++]=arr2.get(j++);
           }
       }
	}

}
