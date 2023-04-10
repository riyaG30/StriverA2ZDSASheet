package slidingwindow;

import java.util.Scanner;

public class MinimumWindowSubsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(minimumWindow(sc.next(),sc.next()));
		sc.close();
	}

	private static String minimumWindow(String s, String p) {
		int right=0;
	       int min=Integer.MAX_VALUE;
	       String ans="";
	       while(right<s.length())
	       {
	           int i=0;
	           while(right<s.length())
	           {
	               if(s.charAt(right)==p.charAt(i))
	               {
	                   i++;
	               }
	               //In the parent subsequence it might come a point where the child subsequence may be present
	               //Hence the value of i may exceed
	               if(i==p.length())
	                    break;
	               right++;
	           }
	           //If there is no subsequence 
	           if(right>=s.length())
	                break;
	            //right will be present at the last character of str2 int str1
	            int left=right;
	            //Now again checking from the last to find the minimum
	            i=p.length()-1;
	            while(left>=0)
	            {
	                if(s.charAt(left)==p.charAt(i))
	                {
	                    i--;
	                }
	                if(i==-1)
	                    break;
	                left--;
	            }
	            if(right-left+1<min)
	            {
	                min=right-left+1;
	                ans=s.substring(left,right+1);
	            }
	            right=left+1;    
	       }
	       return ans;
	}
}
