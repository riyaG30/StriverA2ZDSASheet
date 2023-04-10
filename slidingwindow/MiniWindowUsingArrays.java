package slidingwindow;

import java.util.Scanner;

public class MiniWindowUsingArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(minimumWindow(s,sc.next()));
		sc.close();

	}

	private static String minimumWindow(String s, String p) {
		int[] arr1=new int[26];
		int[] arr2=new int[26];
		
		for(int i=0;i<p.length();i++)
		{
			arr1[p.charAt(i)-'a']++;
		}
		int i=0,j=0,count=0;
		int n=s.length();
		String ans="";
		while(true)
		{
			boolean f1=false;
			boolean f2=false;
			
			while(i<n && count<p.length())
			{
				arr2[s.charAt(i)-'a']++;
				if(arr2[s.charAt(i)]<=arr1[s.charAt(i)-'a'])
					count++;
				i++;
				f1=true;
			}
			
			while(j<n && count==p.length())
			{
				String ans1=s.substring(i,j);
				if(ans.length()==0 || ans1.length()<ans.length())
				{
					ans=ans1;
				}
				arr2[s.charAt(j)-'a']--;
				if(arr2[s.charAt(j)]<arr1[s.charAt(j)])
					count--;
				j++;
				f2=true;
			}
			if(!f1 && !f2)
				break;
			
		}
		return ans;
	}

}
