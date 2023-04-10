package greedy;

import java.util.Scanner;

public class JumpGame {
	static int canReach(int[] A, int N) {
        int reachable=0;
        for(int i=0;i<N;i++)
        {
            if(reachable<i)
                return 0;
            reachable = Math.max(reachable,A[i]+i);
        }
        return 1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(canReach(arr,n));
		sc.close();
	}

}
