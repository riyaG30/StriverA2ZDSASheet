package stringeasy;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		sc.close();
		if(str1.length()!=str2.length())
		{
			System.out.println("false");
			return;
		}
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Boolean> map2 =new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            if(map1.containsKey(str1.charAt(i)))
            {
                if(map1.get(str1.charAt(i))!=str2.charAt(i))
                {
        			System.out.println("false");
        			return;
        		}
            }
            else
            {
                if(map2.containsKey(str2.charAt(i)))
                {
        			System.out.println("false");
        			return;
        		}
                else
                {
                    map1.put(str1.charAt(i),str2.charAt(i));
                    map2.put(str2.charAt(i),true);
                }
            }
        }
        System.out.println("true");
	}

}
