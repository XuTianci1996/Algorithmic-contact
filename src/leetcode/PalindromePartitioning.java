package leetcode;

import java.util.*;

public class PalindromePartitioning {

	public static void main(String[] args) {
		List<List<String>> l = partition("122");
		for (List lst : l) {
			for (Object i : lst) {
				System.out.print(i+",");
			}
			System.out.println();
		}
	}

	static List<List<String>> lists = new ArrayList<List<String>>();
	public static List<List<String>> partition(String s) {
        if(s.length()==0) return lists;
        List<String> list = new ArrayList<String>();
        f(s,list,0);
        return lists;
    }
	
	public static void f(String s, List<String> list, int index) {
		if(index == s.length()){
			//System.out.println(list.size());
			lists.add(new ArrayList<>(list));
			return;
		}
		for(int i = index;i<s.length();i++){
			if(isPalindrome(s, index, i)){
				System.out.println(i);
				list.add(s.substring(index, i+1));
				f(s,list,i+1);
				list.remove(list.size()-1);
			}
		}
		return;
	}

	public static boolean isPalindrome(String s,int start, int end){
		//System.out.println(s.substring(start, end+1));
		while(start<end){
			if(s.charAt(start)!=s.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
