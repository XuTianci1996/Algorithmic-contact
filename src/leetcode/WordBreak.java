package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		String s ="abcd";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("a");
		wordDict.add("abc");
		wordDict.add("b");
		wordDict.add("cd");
		
		System.out.println(wordBreak(s, wordDict));
	}

	
	public static boolean wordBreak(String s, List<String> wordDict) {
		 int len = s.length();
	        boolean[] f = new boolean[len+1];
	        f[0] = true;
	        for (int i=1; i<len+1; i++)
	            for (int j=0; j<i; j++)
	                if (f[j] && wordDict.contains(s.substring(j,i)))
	                {
	                    f[i] = true;
	                }
	        return f[len];
    }
	
}
