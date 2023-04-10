package stringeasy;

import java.util.Scanner;

public class ReverseEveryWordInALineWithDot {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		StringBuilder sb=new StringBuilder();
	       String[] s=S.split("\\.");
	       int start=0,end=s.length-1;
	       while(start<end)
	       {
	           String temp=s[start];
	           s[start]=s[end];
	           s[end]=temp;
	           start++;
	           end--;
	       }
	       int i=0;
	       for(;i<s.length-1;i++)
	       {
	           sb.append(s[i]);
	           sb.append(".");
	       }
	       sb.append(s[i]);
	       System.out.println(sb);
	       //for return sb.toString();
	       sc.close();
	}

}
