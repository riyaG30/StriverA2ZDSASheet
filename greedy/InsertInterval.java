package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertInterval {
	 static int[][] insertNewEvent(int[][] intervals, int[] newInterval) {
	        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
	        List<int[]> ls=new ArrayList<>();
	        for(int[] i:intervals)
	        {
	            if(newInterval==null || i[1]<newInterval[0])
	            {
	                ls.add(i);
	            }
	            else if(i[0]>newInterval[1])
	            {
	                ls.add(newInterval);
	                ls.add(i);
	                newInterval=null;
	            }
	            else
	            {
	                newInterval[0]=Math.min(i[0],newInterval[0]);
	                newInterval[1]=Math.max(i[1],newInterval[1]);
	            }
	        }
	        if(newInterval!=null)
	            ls.add(newInterval);
	        return ls.toArray(new int[1][0]);
	  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= {{1,3},{2,4},{6,8},{9,10}};
		int[] arr1= {5,10};
		System.out.println(insertNewEvent(arr,arr1));//o/p will be an address
		sc.close();

	}

}
