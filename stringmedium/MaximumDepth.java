package stringmedium;

import java.util.Scanner;

public class MaximumDepth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		 int max=Integer.MIN_VALUE,open=0;
	       for(int i=0;i<s.length();i++)
	       {
	           if(s.charAt(i)=='(')
	               open++;
	            else if(s.charAt(i)==')')
	                open--;
	            max=Math.max(open,max);
	       }
	       System.out.println(max);
	       sc.close();
	}

}
