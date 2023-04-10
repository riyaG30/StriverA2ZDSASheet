package recursionmedium;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateSubsequence {
	public static void generate(String s,String p,ArrayList<String> ans)
    {
        if(s.isEmpty())
        {
        	ans.add(p);
            System.out.println(ans);
            ans.remove(ans.size()-1);
            return;
        }
        generate(s.substring(1),p+s.charAt(0),ans);
        generate(s.substring(1),p,ans);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		generate(s,"",new ArrayList<>());
		sc.close();
	}
}
