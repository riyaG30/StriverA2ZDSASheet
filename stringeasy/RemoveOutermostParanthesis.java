package stringeasy;

import java.util.Scanner;

public class RemoveOutermostParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="";
        int j=0,open=0,close=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
               open++; 
            }
            else if(s.charAt(i)==')')
            {
                close++;
            }
            if(open==close)
            {
                ans+=s.substring(j+1,i);
                j=i+1;
            }
        }
        System.out.println(ans);
        sc.close();
	}

}
