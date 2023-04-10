package recursiondifficult;

import java.util.*;

public class PalindromePartitioning {
	 public static void getPartition(String s,int index,ArrayList<String> ans,List<List<String>> ls)
	    {
	       if(index==s.length())
	       {
	           ls.add(new ArrayList<>(ans));
	           return;
	       }
	       for(int i=index;i<s.length();i++)
	       {
	           if(palindrome(s,index,i))
	           {
	               ans.add(s.substring(index,i+1));
	               getPartition(s,i+1,ans,ls);
	               ans.remove(ans.size()-1);     
	           }
	       }
	    }
	    public static boolean palindrome(String s,int start,int end)
	    {
	        while(start<=end)
	        {
	            if(s.charAt(start++)!=s.charAt(end--))
	                return false;
	        }
	        return true;
	    }
	    public static List<List<String>> partition(String s) {
	        List<List<String>> ls=new ArrayList<>();
	        getPartition(s,0,new ArrayList<String>(),ls);
	        return ls;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(partition(s));
		sc.close();
	}

}
