package greedy;

import java.util.Arrays;
import java.util.Scanner;

class Job
{
	int id;
	int profit;
	int deadline;
	public Job(int id,int p,int d)
	{
		this.id=id;
		profit=p;
		deadline=d;
	}
}
public class JobSequencingProblem {
	static int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,(Job a,Job b)->b.profit-a.profit);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i].profit);
        }
        int totalprofit=0;
        int[] dead=new int[max+1];
        Arrays.fill(dead,-1);
        int count=0;
        for(int i=0;i<n;i++)
        {
            int deadline=arr[i].deadline;
            int profit=arr[i].profit;
            int id=arr[i].id;
            // System.out.println(profit);
            while(deadline>0)
            {
                if(dead[deadline] == -1)
                {
                    dead[deadline]=id;
                    totalprofit+=profit;
                    count++;
                    break;
                }
                deadline--;
            }
        }
        return new int[]{count,totalprofit};
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Job[] arr=new Job[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Job(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		System.out.println(JobScheduling(arr,n));
		sc.close();
	}

}
