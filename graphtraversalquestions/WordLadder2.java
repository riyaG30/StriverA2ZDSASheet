package graphtraversalquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadder2 {
	public ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord, String[] wordList)
    {
        HashSet<String> hs=new HashSet<>();
        for(String s:wordList)
        {
            hs.add(s);
        }
        Queue<ArrayList<String>> q=new LinkedList<>();
        ArrayList<String> ls=new ArrayList<>();
        ls.add(startWord);
        q.add(ls);
        ArrayList<String> level=new ArrayList<>();
        level.add(startWord);
        int count=0;
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            ArrayList<String> temp=q.peek();
            q.poll();
            String word = temp.get(temp.size()-1);
            if(temp.size()>count)
            {
                for(String s:level)
                {
                    hs.remove(s);
                }
                count++;
            }
            if(word.equals(targetWord))
            {
                if(ans.size()==0)
                    ans.add(temp);
                else if(ans.get(0).size()==temp.size())
                    ans.add(temp);
            }
            for(int i=0;i<word.length();i++)
            {
                for(char j='a';j<='z';j++)
                {
                    char[] replace=word.toCharArray();
                    replace[i]=j;
                    String word1=new String(replace);
                    if(hs.contains(word1))
                    {
                        temp.add(word1);
                        ArrayList<String> store=new ArrayList<>(temp);
                        q.add(store);
                        level.add(word1);
                        temp.remove(temp.size()-1);
                    }
                }
            }
        }
        return ans;
    }
}
