package arrayshard;

import java.util.*;

public class MergeOverLappingSubInterval {
	public static int[][] overlapping(int[][] intervals)
	{
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		int start=intervals[0][0];
		int end=intervals[0][1];
		List<int[]> ls=new ArrayList<>();
		for(int[] i:intervals)
		{
			if(end>=i[0])
			{
				end=Math.max(end, i[1]);
			}
			else
			{
				ls.add(new int[] {start,end});
				start=i[0];
				end=i[1];
			}
		}
		ls.add(new int[] {start,end});
		return ls.toArray(new int[0][]);
	}
}
