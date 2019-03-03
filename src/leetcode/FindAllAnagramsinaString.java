package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsinaString {

	public static void main(String[] args) {
		String s="cbaebabacd";
		String p="abc";
		List<Integer> list= findAnagrams(s, p);
		for(int n: list){
			System.out.print(n+" ");
		}
	}

	
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= s.length()-p.length(); i++) {
			if(f(s.substring(i, i+p.length()),p)){
				list.add(i);
			}
		}
		return list;
    }
	
	public static boolean f(String s,String p){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < p.length(); i++) {
			if(!map.containsKey(p.charAt(i))){
				map.put(p.charAt(i), 1);
			}else{
				map.put(p.charAt(i), map.get(p.charAt(i))+1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))-1);
				if(map.get(s.charAt(i))<0) return false;
			}else{
				return false;
			}
		}
		return true;
	}
}
