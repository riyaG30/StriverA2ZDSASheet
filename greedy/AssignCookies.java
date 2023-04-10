package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCookies {
	public static int findContentChildren(int[] g, int[] s) {
        if(s.length==0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int j=0;
        int i=0;
        while(i<g.length && j<s.length)
        {
            if(s[j]>=g[i])
            {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] greed=new int[n];
		for(int i=0;i<n;i++)
		{
			greed[i]=sc.nextInt();
		}
		int[] sz=new int[m];
		for(int i=0;i<m;i++)
		{
			sz[i]=sc.nextInt();
		}
		System.out.println(findContentChildren(greed,sz));
		sc.close();
	}

}
