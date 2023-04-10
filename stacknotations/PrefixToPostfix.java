package stacknotations;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {
	static String preToPost(String exp) {
        Stack<String> s=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            if(!Character.isAlphabetic(exp.charAt(i)))
            {
                String A=s.pop();
                String B=s.pop();
                String C=exp.charAt(i)+B+A;
                s.push(C);
            }
            else
                s.push(exp.charAt(i)+"");
        }
        return s.peek();
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(preToPost(s));
		sc.close();

	}
}
