package graphtraversalquestions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Word
{
    String word;
    int count;
    public Word(String w,int c)
    {
        word=w;
        count=c;
    }
}
public class WordLadder1 {
	public static int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        HashSet<String> hs=new HashSet<>();
        for(String s:wordList)
        {
            hs.add(s);
        }
        Queue<Word> q=new LinkedList<>();
        q.add(new Word(startWord,1));
        hs.remove(startWord);
        while(!q.isEmpty())
        {
            String word=q.peek().word;
            int count=q.peek().count;
            q.poll();
            if(word.equals(targetWord))
                return count;
            for(int i=0;i<word.length();i++)
            {
                for(char j='a';j<='z';j++)
                {
                    char[] replace=word.toCharArray();
                    replace[i]=j;
                    String replace1=new String(replace);
                    if(hs.contains(replace1))
                    {
                        q.add(new Word(replace1,count+1));
                        hs.remove(replace1);
                    }
                }
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] word=new String[n];
		for(int i=0;i<n;i++)
		{
			word[i]=sc.next();
		}
		System.out.println(wordLadderLength(sc.next(),sc.next(),word));
		sc.close();
	}
}
