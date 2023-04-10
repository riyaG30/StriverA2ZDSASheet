package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OverLappingIntervals {
	public static int[][] overlappedInterval(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ls=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] i:intervals)
        {
            if(i[0]>end)
            {
                ls.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
            else
            {
                end=Math.max(end,i[1]);
            }
        }
        ls.add(new int[]{start,end});
        return ls.toArray(new int[1][]);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= {{1,3},{2,4},{6,8},{9,10}};
		System.out.println(overlappedInterval(arr));//o/p will be an address
		sc.close();
	}

}
