package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Candy {
	//Remember to take a note of the rating and the candies as well
	//Traverse from front and back
	public static int candy(int[] ratings) {
        int cost=0;
        int[] candies=new int[ratings.length];
        Arrays.fill(candies,1);
        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i]>ratings[i-1] && candies[i]<=candies[i-1])
            {
                candies[i]=1+candies[i-1];
            }
        }
        for(int i=ratings.length-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1] && candies[i]<=candies[i+1])
            {
                candies[i]=1+candies[i+1];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            cost+=candies[i];
        }
        return cost;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(candy(arr));
		sc.close();
	}

}
