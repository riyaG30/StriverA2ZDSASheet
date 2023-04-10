package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
	public static String removeKdigits(String S, int K) {
        Stack<Character> s=new Stack<>();
        //If stack is empty put the element inside the stack
        //If not empty check whether the element inside the stack is lesser than the incoming element
        //Base case if the size of k==size
        if(K==S.length())
            return "0";
        for(int i=0;i<S.length();i++)
        {
            while(K>0 && !s.isEmpty() && s.peek()>S.charAt(i))
            {
                s.pop();
                K--;
            }
            s.push(S.charAt(i));
        }
        while(K>0)
        {
            s.pop();
            K--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        sb.reverse();
        while(sb.length() > 0 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        if(sb.isEmpty())
            return "0";
        return sb.toString();
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(removeKdigits(s,sc.nextInt()));
		sc.close();
	}

}
