package greedy;

import java.util.Scanner;

public class JumpGame2 {
	static int minJumps(int[] arr){
	       //We will make the jump only when the value of i==reachable so that we can make a optimal jump
	       //For this we can have a farthest ,jump
	       int farthest=0;
	       int current=0;
	       int count=0;
	       //we have to go arr.length-1
	       for(int i=0;i<arr.length-1;i++)
	       {
	           farthest=Math.max(farthest,arr[i]+i);
	           if(current==i)
	           {
	               count++;
	               current=farthest;
	           }
	       }
	       if(current<arr.length-1)
	            return -1;
	       return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(minJumps(arr));
		sc.close();

	}

}
