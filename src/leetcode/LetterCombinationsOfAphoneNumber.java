package leetcode;

import java.util.*;

public class LetterCombinationsOfAphoneNumber {

	public static void main(String[] args) {
		List<String> l = letterCombinations("234");
		for(String s:l){
			System.out.println(s);
		}
	}

	public static String[] strs = {
	        "",
	        "",
	        "abc",
	        "def",
	        "ghi",
	        "jkl",
	        "mno",
	        "pqrs",
	        "tuv",
	        "wxyz"
	    };
	    static List<String> lists = new ArrayList<String>();
	    public static List<String> letterCombinations(String digits) {
	        if(digits.length()==0) return lists;
	    	findAll(0, digits, "");
	    	return lists;
	    }
	    public static void findAll(int index,String digits,String str){
	    	if(digits.length()==index){
	    		lists.add(str);
	    		return ;
	    	}
	    	String s = strs[digits.charAt(index)-'0'];
	    	for(int i=0;i<s.length();i++){
	    		findAll(index+1, digits, str+s.charAt(i));
	    	}
	    	return;
	    }
}
