package greedy;

import java.util.Scanner;

public class TotalFoodRequiredForSurvival {

	public static void main(String[] args) {
		// S-> Total days you can buy foods
		// M -> Food required each day
		// N ->How much food you can purchase
		//On sunday you cannot buy any food
		//So days on which you can buy = S - S/7; 14 will have two sundays
		// Is it possible to do so.....
		// Total days = id even->(S*M)/N ->  buying days      id odd->(S*M)/N + 1
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int m=sc.nextInt();
		int ans=0;
		int days=s - s/7;
		sc.close();
		if(s*m / n ==0)
			ans=s*m/n;
		else
			ans=(s*m)/n + 1;
		if(ans<=days)
		{
			System.out.println(ans);
			return;
		}
		System.out.println("-1");
	}

}
