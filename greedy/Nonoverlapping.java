package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Nonoverlapping {
	static int minRemoval(int intervals[][]) {
	       Arrays.sort(intervals,(a,b)->a[1]-b[1]);
	       int count=-1;
	       int end=intervals[0][1];
	       for(int[] i:intervals)
	       {
	           if(i[0]>=end)
	           {
	               end=i[1];
	           }
	           else
	                count++;
	       }
	       return count;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= {{1,3},{2,4},{6,8},{9,10}};
		System.out.println(minRemoval(arr));//o/p will be an address
		sc.close();

	}

}
